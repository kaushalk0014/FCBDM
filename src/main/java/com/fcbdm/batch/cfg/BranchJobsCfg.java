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

import com.fcbdm.bo.Branch;
import com.fcbdm.processor.BranchItemProcessor;
import com.fcbdm.readers.BranchItemReader;
import com.fcbdm.writers.BranchItemWriter;
@Configuration
public class BranchJobsCfg {
   @Autowired
	private StepBuilderFactory stepBuilderFactory;
   @Autowired
	private JobBuilderFactory jobBuilderFactory;
   @Autowired
   private BranchItemReader branchItemReader;
   @Autowired
   private BranchItemProcessor branchItemProcessor;
   @Autowired
   private BranchItemWriter branchItemWriter;
   @Bean
   public Step createBranchStep(){
	 return  stepBuilderFactory.get("createBranchStep").chunk(1).reader(branchItemReader.createBranchItemReader()).processor((ItemProcessor)branchItemProcessor).writer((ItemWriter)branchItemWriter.createBranchItemWriter()).build();
   }
   @Bean
   public Job createBranchJob(){
	  return jobBuilderFactory.get("createBranchJob").flow(createBranchStep()).end().build();
   }
}





