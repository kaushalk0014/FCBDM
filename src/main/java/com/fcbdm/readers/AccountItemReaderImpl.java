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

import com.fcbdm.bo.Account;
/**
 * This  is representing AccountItemReader
 * 
 * @author sathish
 * @since FCBDM 1.0
 */
public class AccountItemReaderImpl  implements AccountItemReader {
	/**
	 * The Method returns AccountItemReader.
	 * The AccountItemReader connected with a flat file
	 * @return ItemReader<Account>
	 */
	
	public ItemReader<Account> createAccountItemReader() {
		FlatFileItemReader<Account> itemReader = new FlatFileItemReader<Account>();
		itemReader.setResource(new FileSystemResource("D://FCB_FLAT_FILES/Account.csv"));
		itemReader.setLinesToSkip(1);
		itemReader.setLineMapper(createAccountLineMapper());
		return itemReader;
	}

	

	private LineMapper<Account> createAccountLineMapper() {
		DefaultLineMapper<Account> lineMapper = new DefaultLineMapper<>();
		lineMapper.setFieldSetMapper(createAccountFieldSetMapper());
		lineMapper.setLineTokenizer(createAccountLineTokenizer());
		return lineMapper;
	}

	private FieldSetMapper<Account> createAccountFieldSetMapper() {
		BeanWrapperFieldSetMapper<Account> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
		fieldSetMapper.setTargetType(Account.class);
		return fieldSetMapper;
	}

	private LineTokenizer createAccountLineTokenizer() {
		DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
		lineTokenizer.setDelimiter(";");
		lineTokenizer.setNames(new String[] { "accountNumber", "accountHolderName", "accountBalance","accountStatus" , "accountOpenedDate","createdBy","createdDate","updateBy","updateDate","acccountTypeId","branchId","accountActiveServices","customerId","accountId"});
		return lineTokenizer;
	}

	
	
}
