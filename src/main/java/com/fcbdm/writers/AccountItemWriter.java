/*
 * Copyright (c) 2017, 2018, FCBDM and/or its affiliates. All rights reserved.
 * FCBDM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.fcbdm.writers;


import org.springframework.batch.item.ItemWriter;

import com.fcbdm.bo.Account;

/**
 * This  is representing AccountItemWriter
 * 
 * @author sathish
 * @since FCBDM 1.0
 */
public interface AccountItemWriter  {
	/**
	 * The Method returns AccountItemWriter.
	 * The AccountItemWriter connected with a DataBase
	 * @return ItemWriter<Account>
	 */
	
public ItemWriter<Account> createBankItemWriter();
}
