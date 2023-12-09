/*
 * Copyright (c) 2017, 2018, FCBDM and/or its affiliates. All rights reserved.
 * FCBDM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.fcbdm.readers;

import org.springframework.batch.item.ItemReader;

import com.fcbdm.bo.Account;


/**
 * This  is representing accountItemReader
 * 
 * @author sathish
 * @since FCBDM 1.0
 */
public interface AccountItemReader {
	/**
	 * The Method returns accountItemReader.
	 * The accountItemReader connected with a flat file
	 * @return ItemReader<account>
	 */
	public ItemReader<Account> createAccountItemReader();
}
