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

import com.fcbdm.bo.Branch;
/**
 * This  is representing BranchItemReader
 * 
 * @author sathish
 * @since FCBDM 1.0
 */
@Repository
public class BranchItemReaderImpl implements BranchItemReader {
	/**
	 * The Method returns BranchItemReader.
	 * The BranchItemReader connected with a flat file
	 * @return ItemReader<Branch>
	 */
	public ItemReader<Branch> createBranchItemReader() {
		FlatFileItemReader<Branch> itemReader = new FlatFileItemReader<Branch>();
		itemReader.setResource(new FileSystemResource("D://FCB_FLAT_FILES/Branch.csv"));
		itemReader.setLinesToSkip(1);
		itemReader.setLineMapper(createBranchLineMapper());
		return itemReader;
	}

	private LineMapper<Branch> createBranchLineMapper() {
		DefaultLineMapper<Branch> lineMapper = new DefaultLineMapper<>();
		lineMapper.setFieldSetMapper(createBranchFieldSetMapper());
		lineMapper.setLineTokenizer(createBranchLineTokenizer());
		return lineMapper;
	}

	private FieldSetMapper<Branch> createBranchFieldSetMapper() {
		BeanWrapperFieldSetMapper<Branch> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
		fieldSetMapper.setTargetType(Branch.class);
		return fieldSetMapper;
	}

	private LineTokenizer createBranchLineTokenizer() {
		DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
		lineTokenizer.setDelimiter(";");
		lineTokenizer.setNames(new String[] { "branchId", "branchName", "branchAddress","branchCity","branchState","branchCountry","branchZipCode","branchEmail","branchPhoneNumber1","branchPhoneNumber2","bankIdentifierCode","branchCode","chequeProcessingCode","bankId" });
		return lineTokenizer;
	}
}
