/*
 * Copyright (c) 2017, 2018, FCBDM and/or its affiliates. All rights reserved.
 * FCBDM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.fcbdm.readers;

import org.springframework.batch.item.ItemReader;

import com.fcbdm.bo.AccountActiveServices;

/**
 * This interface is representing accountItemReader to perform read operations on CSV file
 * 
 * @author sathish
 * @since FCBDM 1.0
 */

public interface AccountActiveServicesItemReader {
	
	/**
	 * The Method returns AccountActiveServicesItemReader.
	 * The accountActiveServicesItemReader connected with a flat file
	 * 
	 * @return ItemReader<AccountActiveServices>
	 */

	public ItemReader<AccountActiveServices> createAccountActiveServices();
	
}
