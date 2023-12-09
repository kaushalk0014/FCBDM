/*
 * Copyright (c) 2017, 2018, FCBDM and/or its affiliates. All rights reserved.
 * FCBDM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.fcbdm.bo;

/**
 * This is a Java Bean based class and used to hold Bussiness Data
 * 
 * @author sathish
 * @since FCBDM 1.0
 */

public class AccountType {
	
	private Integer accountTypeId;
	private String accountTypeName;
	/**
	 * @return the accountTypeId
	 */
	public Integer getAccountTypeId() {
		return accountTypeId;
	}
	/**
	 * @param accountTypeId the accountTypeId to set
	 */
	public void setAccountTypeId(Integer accountTypeId) {
		this.accountTypeId = accountTypeId;
	}
	/**
	 * @return the accountTypeName
	 */
	public String getAccountTypeName() {
		return accountTypeName;
	}
	/**
	 * @param accountTypeName the accountTypeName to set
	 */
	public void setAccountTypeName(String accountTypeName) {
		this.accountTypeName = accountTypeName;
	}
}
