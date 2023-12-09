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

import com.fcbdm.processor.WorkingHoursItemProcessor;
import com.fcbdm.readers.WorkingHoursItemReader;
import com.fcbdm.writers.WorkingHoursItemWriter;
@Configuration
public class WorkingHoursJobsCfg {
   @Autowired
	private StepBuilderFactory stepBuilderFactory;
   @Autowired
	private JobBuilderFactory jobBuilderFactory;
   @Autowired
   private WorkingHoursItemReader workingHoursItemReader;
   @Autowired
   private WorkingHoursItemProcessor workingHoursItemProcessor;
   @Autowired
   private WorkingHoursItemWriter workingHoursItemWriter;
   @Bean
   public Step createWorkingHoursStep(){
	 return  stepBuilderFactory.get("createWorkingHoursStep").chunk(1).reader(workingHoursItemReader.createWorkingHoursItemReader()).processor((ItemProcessor)workingHoursItemProcessor).writer((ItemWriter)workingHoursItemWriter.createWorkingHoursItemWriter()).build();
   }
   @Bean
   public Job createWorkingHoursJob(){
	  return jobBuilderFactory.get("createWorkingHoursJob").flow(createWorkingHoursStep()).end().build();
   }
}





