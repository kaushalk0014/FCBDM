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

import com.fcbdm.bo.Time;
/**
 * This  is representing TimeItemReader
 * 
 * @author sathish
 * @since FCBDM 1.0
 */
@Repository
public class TimeItemReaderImpl implements TimeItemReader {
	/**
	 * The Method returns TimeItemReader.
	 * The TimeItemReader connected with a flat file
	 * @return ItemReader<Time>
	 */
	public ItemReader<Time> createTimeItemReader() {
		FlatFileItemReader<Time> itemReader = new FlatFileItemReader<Time>();
		itemReader.setResource(new FileSystemResource("D://FCB_FLAT_FILES/Time.csv"));
		itemReader.setLinesToSkip(1);
		itemReader.setLineMapper(createTimeLineMapper());
		return itemReader;
	}

	private LineMapper<Time> createTimeLineMapper() {
		DefaultLineMapper<Time> lineMapper = new DefaultLineMapper<>();
		lineMapper.setFieldSetMapper(createTimeFieldSetMapper());
		lineMapper.setLineTokenizer(createTimeLineTokenizer());
		return lineMapper;
	}

	private FieldSetMapper<Time> createTimeFieldSetMapper() {
		BeanWrapperFieldSetMapper<Time> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
		fieldSetMapper.setTargetType(Time.class);
		return fieldSetMapper;
	}

	private LineTokenizer createTimeLineTokenizer() {
		DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
		lineTokenizer.setDelimiter(";");
		lineTokenizer.setNames(new String[] { "timeId", "openingHours", "closingHours" });
		return lineTokenizer;
	}
}
