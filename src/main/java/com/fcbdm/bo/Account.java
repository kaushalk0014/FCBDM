/*
 * Copyright (c) 2017, 2018, FCBDM and/or its affiliates. All rights reserved.
 * FCBDM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.fcbdm.bo;

import java.sql.Timestamp;

/**
 * This is a Java Bean based class and used to hold Bussiness Data
 * 
 * @author sathish
 * @since FCBDM 1.0
 */

public class Account {
	
	private Long accountNumber;
	private String accountHolderName;
	private Double accountBalance;
	private Integer accountStatus;
	private Timestamp accountOpenedDate;
	private Integer createdBy;
	private Timestamp createdDate;
	private Integer updatedBy;
	private Timestamp updatedDate;
	private Integer accountTypeId;
	private Integer branchId;
	private Integer accountActiveServices;
	private Integer customerId;
	private Integer accountId;
	/**
	 * @return the accountNumber
	 */
	public long getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the accountHolderName
	 */
	public String getAccountHolderName() {
		return accountHolderName;
	}
	/**
	 * @param accountHolderName the accountHolderName to set
	 */
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	/**
	 * @return the accountBalance
	 */
	public double getAccountBalance() {
		return accountBalance;
	}
	/**
	 * @param accountBalance the accountBalance to set
	 */
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	/**
	 * @return the accountStatus
	 */
	public Integer getAccountStatus() {
		return accountStatus;
	}
	/**
	 * @param accountStatus the accountStatus to set
	 */
	public void setAccountStatus(Integer accountStatus) {
		this.accountStatus = accountStatus;
	}
	/**
	 * @return the accountOpenedDate
	 */
	public Timestamp getAccountOpenedDate() {
		return accountOpenedDate;
	}
	/**
	 * @param accountOpenedDate the accountOpenedDate to set
	 */
	public void setAccountOpenedDate(Timestamp accountOpenedDate) {
		this.accountOpenedDate = accountOpenedDate;
	}
	/**
	 * @return the createdBy
	 */
	public Integer getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the createdDate
	 */
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the updatedBy
	 */
	public Integer getUpdatedBy() {
		return updatedBy;
	}
	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}
	/**
	 * @return the updatedDate
	 */
	public Timestamp getUpdatedDate() {
		return updatedDate;
	}
	/**
	 * @param updatedDate the updatedDate to set
	 */
	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}
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
	 * @return the branchId
	 */
	public Integer getBranchId() {
		return branchId;
	}
	/**
	 * @param branchId the branchId to set
	 */
	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}
	/**
	 * @return the accountActiveServices
	 */
	public Integer getAccountActiveServices() {
		return accountActiveServices;
	}
	/**
	 * @param accountActiveServices the accountActiveServices to set
	 */
	public void setAccountActiveServices(Integer accountActiveServices) {
		this.accountActiveServices = accountActiveServices;
	}
	/**
	 * @return the customerId
	 */
	public Integer getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the accountId
	 */
	public Integer getAccountId() {
		return accountId;
	}
	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
		
}
