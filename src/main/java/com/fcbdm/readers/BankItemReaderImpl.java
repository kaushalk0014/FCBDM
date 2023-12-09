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
import org.springframework.stereotype.Repository;

import com.fcbdm.bo.Bank;
/**
 * This  is representing BankItemReader
 * 
 * @author sathish
 * @since FCBDM 1.0
 */
@Repository
public class BankItemReaderImpl implements BankItemReader {
	/**
	 * The Method returns BankItemReader.
	 * The BankItemReader connected with a flat file
	 * @return ItemReader<Bank>
	 */
	public ItemReader<Bank> createBankItemReader() {
		FlatFileItemReader<Bank> itemReader = new FlatFileItemReader<Bank>();
		itemReader.setResource(new FileSystemResource("D://FCB_FLAT_FILES/Bank.csv"));
		itemReader.setLinesToSkip(1);
		itemReader.setLineMapper(createBankLineMapper());
		return itemReader;
	}

	private LineMapper<Bank> createBankLineMapper() {
		DefaultLineMapper<Bank> lineMapper = new DefaultLineMapper<>();
		lineMapper.setFieldSetMapper(createBankFieldSetMapper());
		lineMapper.setLineTokenizer(createBankLineTokenizer());
		return lineMapper;
	}

	private FieldSetMapper<Bank> createBankFieldSetMapper() {
		BeanWrapperFieldSetMapper<Bank> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
		fieldSetMapper.setTargetType(Bank.class);
		return fieldSetMapper;
	}

	private LineTokenizer createBankLineTokenizer() {
		DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
		lineTokenizer.setDelimiter(";");
		lineTokenizer.setNames(new String[] { "bankId", "bankName", "bankType" });
		return lineTokenizer;
	}
}
