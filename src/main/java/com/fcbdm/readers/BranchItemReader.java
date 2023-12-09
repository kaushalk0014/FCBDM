/*
 * Copyright (c) 2017, 2018, FCBDM and/or its affiliates. All rights reserved.
 * FCBDM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.fcbdm.readers;

import org.springframework.batch.item.ItemReader;

import com.fcbdm.bo.Branch;

/**
 * This  is representing BranchItemReader
 * 
 * @author sathish
 * @since FCBDM 1.0
 */
public interface BranchItemReader {
	/**
	 * The Method returns BranchItemReader.
	 * The BranchItemReader connected with a flat file
	 * @return ItemReader<Branch>
	 */
	public ItemReader<Branch> createBranchItemReader();
}
