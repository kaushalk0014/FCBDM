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

import com.fcbdm.bo.WorkingHours;
/**
 * This  is representing WorkingHoursItemReader
 * 
 * @author sathish
 * @since FCBDM 1.0
 */
@Repository
public class WorkingHoursItemReaderImpl implements WorkingHoursItemReader {
	/**
	 * The Method returns WorkingHoursItemReader.
	 * The WorkingHoursItemReader connected with a flat file
	 * @return ItemReader<WorkingHours>
	 */
	public ItemReader<WorkingHours> createWorkingHoursItemReader() {
		FlatFileItemReader<WorkingHours> itemReader = new FlatFileItemReader<WorkingHours>();
		itemReader.setResource(new FileSystemResource("D://FCB_FLAT_FILES/WorkingHours.csv"));
		itemReader.setLinesToSkip(1);
		itemReader.setLineMapper(createWorkingHoursLineMapper());
		return itemReader;
	}

	private LineMapper<WorkingHours> createWorkingHoursLineMapper() {
		DefaultLineMapper<WorkingHours> lineMapper = new DefaultLineMapper<>();
		lineMapper.setFieldSetMapper(createWorkingHoursFieldSetMapper());
		lineMapper.setLineTokenizer(createWorkingHoursLineTokenizer());
		return lineMapper;
	}

	private FieldSetMapper<WorkingHours> createWorkingHoursFieldSetMapper() {
		BeanWrapperFieldSetMapper<WorkingHours> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
		fieldSetMapper.setTargetType(WorkingHours.class);
		return fieldSetMapper;
	}

	private LineTokenizer createWorkingHoursLineTokenizer() {
		DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
		lineTokenizer.setDelimiter(";");
		lineTokenizer.setNames(new String[] { "workingHourId", "dayId", "timeId","branchId"});
		return lineTokenizer;
	}
}
