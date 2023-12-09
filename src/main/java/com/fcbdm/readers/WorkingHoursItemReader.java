/*
 * Copyright (c) 2017, 2018, FCBDM and/or its affiliates. All rights reserved.
 * FCBDM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.fcbdm.readers;

import org.springframework.batch.item.ItemReader;

import com.fcbdm.bo.WorkingHours;

/**
 * This  is representing WorkingHoursItemReader
 * 
 * @author sathish
 * @since FCBDM 1.0
 */
public interface WorkingHoursItemReader {
	/**
	 * The Method returns WorkingHoursItemReader.
	 * The WorkingHoursItemReader connected with a flat file
	 * @return ItemReader<WorkingHours>
	 */
	public ItemReader<WorkingHours> createWorkingHoursItemReader();
}
