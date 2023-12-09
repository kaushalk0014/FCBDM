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

import com.fcbdm.bo.Time;
import com.fcbdm.processor.TimeItemProcessor;
import com.fcbdm.readers.TimeItemReader;
import com.fcbdm.writers.TimeItemWriter;
@Configuration
public class TimeJobsCfg {
   @Autowired
	private StepBuilderFactory stepBuilderFactory;
   @Autowired
	private JobBuilderFactory jobBuilderFactory;
   @Autowired
   private TimeItemReader timeItemReader;
   @Autowired
   private TimeItemProcessor timeItemProcessor;
   @Autowired
   private TimeItemWriter timeItemWriter;
   @Bean
   public Step createTimeStep(){
	 return  stepBuilderFactory.get("createTimeStep").chunk(1).reader(timeItemReader.createTimeItemReader()).processor((ItemProcessor)timeItemProcessor).writer((ItemWriter)timeItemWriter.createTimeItemWriter()).build();
   }
   @Bean
   public Job createTimeJob(){
	  return jobBuilderFactory.get("createTimeJob").flow(createTimeStep()).end().build();
   }
}





