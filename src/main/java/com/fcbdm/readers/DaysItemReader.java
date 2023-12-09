/*
 * Copyright (c) 2017, 2018, FCBDM and/or its affiliates. All rights reserved.
 * FCBDM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.fcbdm.readers;

import org.springframework.batch.item.ItemReader;

import com.fcbdm.bo.Days;

/**
 * This  is representing DaysItemReader
 * 
 * @author sathish
 * @since FCBDM 1.0
 */
public interface DaysItemReader {
	/**
	 * The Method returns DaysItemReader.
	 * The DaysItemReader connected with a flat file
	 * @return ItemReader<Days>
	 */
	public ItemReader<Days> createDaysItemReader();
}
