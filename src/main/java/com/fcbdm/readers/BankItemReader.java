/*
 * Copyright (c) 2017, 2018, FCBDM and/or its affiliates. All rights reserved.
 * FCBDM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.fcbdm.readers;

import org.springframework.batch.item.ItemReader;

import com.fcbdm.bo.Bank;

/**
 * This  is representing BankItemReader
 * 
 * @author sathish
 * @since FCBDM 1.0
 */
public interface BankItemReader {
	/**
	 * The Method returns BankItemReader.
	 * The BankItemReader connected with a flat file
	 * @return ItemReader<Bank>
	 */
	public ItemReader<Bank> createBankItemReader();
}
