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

import com.fcbdm.bo.Days;
/**
 * This  is representing DaysItemReader
 * 
 * @author sathish
 * @since FCBDM 1.0
 */
@Repository
public class DaysItemReaderImpl implements DaysItemReader {
	/**
	 * The Method returns DaysItemReader.
	 * The DaysItemReader connected with a flat file
	 * @return ItemReader<Days>
	 */
	public ItemReader<Days> createDaysItemReader() {
		FlatFileItemReader<Days> itemReader = new FlatFileItemReader<Days>();
		itemReader.setResource(new FileSystemResource("D://FCB_FLAT_FILES/Days.csv"));
		itemReader.setLinesToSkip(1);
		itemReader.setLineMapper(createDaysLineMapper());
		return itemReader;
	}

	private LineMapper<Days> createDaysLineMapper() {
		DefaultLineMapper<Days> lineMapper = new DefaultLineMapper<>();
		lineMapper.setFieldSetMapper(createDaysFieldSetMapper());
		lineMapper.setLineTokenizer(createDaysLineTokenizer());
		return lineMapper;
	}

	private FieldSetMapper<Days> createDaysFieldSetMapper() {
		BeanWrapperFieldSetMapper<Days> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
		fieldSetMapper.setTargetType(Days.class);
		return fieldSetMapper;
	}

	private LineTokenizer createDaysLineTokenizer() {
		DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
		lineTokenizer.setDelimiter(";");
		lineTokenizer.setNames(new String[] { "dayId", "day"});
		return lineTokenizer;
	}
}
