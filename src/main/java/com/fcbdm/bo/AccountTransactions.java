/*
 * Copyright (c) 2017, 2018, FCBDM and/or its affiliates. All rights reserved.
 * FCBDM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.fcbdm.bo;

import java.sql.Timestamp;
import java.util.Date;

/**
 * This is a Java Bean based class and used to hold Business Data
 * 
 * @author sathish
 * @since FCBDM 1.0
 */

public class AccountTransactions {
	private Integer transactionId;
	private Timestamp transactionDate;
	private Integer accountNumber;
	private Double transactionAmount;
	private	String transactionMode;
	private String transactionType;
	private String chequeeOrddNumber;
	private String chequeeOrddIssuedBy;
	private Date chequeeOrddIssuedDate;
	/**
	 * @return the transactionId
	 */
	public Integer getTransactionId() {
		return transactionId;
	}
	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	/**
	 * @return the transactionDate
	 */
	public Timestamp getTransactionDate() {
		return transactionDate;
	}
	/**
	 * @param transactionDate the transactionDate to set
	 */
	public void setTransactionDate(Timestamp transactionDate) {
		this.transactionDate = transactionDate;
	}
	/**
	 * @return the accountNumber
	 */
	public Integer getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the transactionAmount
	 */
	public Double getTransactionAmount() {
		return transactionAmount;
	}
	/**
	 * @param transactionAmount the transactionAmount to set
	 */
	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	/**
	 * @return the transactionMode
	 */
	public String getTransactionMode() {
		return transactionMode;
	}
	/**
	 * @param transactionMode the transactionMode to set
	 */
	public void setTransactionMode(String transactionMode) {
		this.transactionMode = transactionMode;
	}
	/**
	 * @return the transactionType
	 */
	public String getTransactionType() {
		return transactionType;
	}
	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	/**
	 * @return the chequeeOrddNumber
	 */
	public String getChequeeOrddNumber() {
		return chequeeOrddNumber;
	}
	/**
	 * @param chequeeOrddNumber the chequeeOrddNumber to set
	 */
	public void setChequeeOrddNumber(String chequeeOrddNumber) {
		this.chequeeOrddNumber = chequeeOrddNumber;
	}
	/**
	 * @return the chequeeOrddIssuedBy
	 */
	public String getChequeeOrddIssuedBy() {
		return chequeeOrddIssuedBy;
	}
	/**
	 * @param chequeeOrddIssuedBy the chequeeOrddIssuedBy to set
	 */
	public void setChequeeOrddIssuedBy(String chequeeOrddIssuedBy) {
		this.chequeeOrddIssuedBy = chequeeOrddIssuedBy;
	}
	/**
	 * @return the chequeeOrddIssuedDate
	 */
	public Date getChequeeOrddIssuedDate() {
		return chequeeOrddIssuedDate;
	}
	/**
	 * @param chequeeOrddIssuedDate the chequeeOrddIssuedDate to set
	 */
	public void setChequeeOrddIssuedDate(Date chequeeOrddIssuedDate) {
		this.chequeeOrddIssuedDate = chequeeOrddIssuedDate;
	}
	
}
