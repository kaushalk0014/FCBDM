package com.fcbdm.batch.cfg;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.fcbdm.bo.Days;
import com.fcbdm.processor.DaysItemProcessor;
import com.fcbdm.readers.DaysItemReader;
import com.fcbdm.writers.DaysItemWriter;
@Configuration
public class DaysJobsCfg {
   @Autowired
	private StepBuilderFactory stepBuilderFactory;
   @Autowired
	private JobBuilderFactory jobBuilderFactory;
   @Autowired
   private DaysItemReader daysItemReader;
   @Autowired
   private DaysItemProcessor daysItemProcessor;
   @Autowired
   private DaysItemWriter daysItemWriter;
   @Bean
   public Step createDaysStep(){
	 return  stepBuilderFactory.get("createDaysStep").chunk(1).reader(daysItemReader.createDaysItemReader()).processor((ItemProcessor)daysItemProcessor).writer((ItemWriter)daysItemWriter.createDaysItemWriter()).build();
   }
   @Bean
   public Job createDaysJob(){
	  return jobBuilderFactory.get("createDaysJob").flow(createDaysStep()).end().build();
   }
}





