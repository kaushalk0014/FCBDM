/*
 * Copyright (c) 2017, 2018, FCBDM and/or its affiliates. All rights reserved.
 * FCBDM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.fcbdm.readers;

import org.springframework.batch.item.ItemReader;

import com.fcbdm.bo.Time;

/**
 * This  is representing TimeItemReader
 * 
 * @author sathish
 * @since FCBDM 1.0
 */
public interface TimeItemReader {
	/**
	 * The Method returns TimeItemReader.
	 * The TimeItemReader connected with a flat file
	 * @return ItemReader<Time>
	 */
	public ItemReader<Time> createTimeItemReader();
}
