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

import com.fcbdm.bo.Bank;
import com.fcbdm.processor.BankItemProcessor;
import com.fcbdm.readers.BankItemReader;
import com.fcbdm.writers.BankItemWriter;
@Configuration
public class BanksJobsCfg {
   @Autowired
	private StepBuilderFactory stepBuilderFactory;
   @Autowired
	private JobBuilderFactory jobBuilderFactory;
   @Autowired
   private BankItemReader bankItemReader;
   @Autowired
   private BankItemProcessor bankItemProcessor;
   @Autowired
   private BankItemWriter bankItemWriter;
   @Bean
   public Step createBankStep(){
	 return  stepBuilderFactory.get("createBankStep").chunk(1).reader(bankItemReader.createBankItemReader()).processor((ItemProcessor)bankItemProcessor).writer((ItemWriter)bankItemWriter.createBankItemWriter()).build();
   }
   @Bean
   public Job createBankJob(){
	  return jobBuilderFactory.get("createBankJob").flow(createBankStep()).end().build();
   }
}





