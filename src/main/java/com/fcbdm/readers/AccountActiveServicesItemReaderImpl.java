/*
 * Copyright (c) 2017, 2018, FCBDM and/or its affiliates. All rights reserved.
 * FCBDM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.fcbdm.readers;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.file.transform.LineTokenizer;
import org.springframework.core.io.FileSystemResource;

import com.fcbdm.bo.AccountActiveServices;

/**
 * This is representing Account Active Services ItemReader which reads the data
 * from CSV file on landing zone
 * 
 * @author sathish
 * @since FCBDM 1.0
 */

public class AccountActiveServicesItemReaderImpl implements AccountActiveServicesItemReader {

	public ItemReader<AccountActiveServices> createAccountActiveServices() {
		FlatFileItemReader<AccountActiveServices> itemReader = new FlatFileItemReader<>();
		itemReader.setResource(new FileSystemResource("D://FCB_FLAT_FILES/AccountActiveServices.csv"));
		itemReader.setLineMapper(createAccountActiveServiceLineMapper());
		itemReader.setLinesToSkip(1);
		return itemReader;
	}

	private LineMapper<AccountActiveServices> createAccountActiveServiceLineMapper() {
		DefaultLineMapper<AccountActiveServices> lineMapper = new DefaultLineMapper<>();
		lineMapper.setFieldSetMapper(createAccountActiveServiceFieldSetMapper());
		lineMapper.setLineTokenizer(createAccountActiveServiceLineTokenizer());
		return lineMapper;
	}	

	private LineTokenizer createAccountActiveServiceLineTokenizer() {
		DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
		lineTokenizer.setDelimiter(";");
		lineTokenizer.setNames(new String[] {"accountActiveServiceId","internetBanking","mobileBanking","phoneBanking","debitCard"});
		return lineTokenizer;
	}
	
	
	private FieldSetMapper<AccountActiveServices> createAccountActiveServiceFieldSetMapper() {
		BeanWrapperFieldSetMapper<AccountActiveServices> fieldSetMapper =  new BeanWrapperFieldSetMapper<>();
		fieldSetMapper.setTargetType(AccountActiveServices.class);
		return fieldSetMapper;
	}	
}