/*
 * Copyright (c) 2017, 2018, FCBDM and/or its affiliates. All rights reserved.
 * FCBDM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.fcbdm.bo;

/**
 * This is a Java Bean based class and used to hold Business Data
 * 
 * @author sathish
 * @since FCBDM 1.0
 */

public class AccountActiveServices {
	private Integer accountActiveServiceId;
	private String internetBanking;	
	private String mobileBanking;	
	private String phoneBanking;	
	private String debitCard;
	/**
	 * @return the accountActiveServiceId
	 */
	public Integer getAccountActiveServiceId() {
		return accountActiveServiceId;
	}
	/**
	 * @param accountActiveServiceId the accountActiveServiceId to set
	 */
	public void setAccountActiveServiceId(Integer accountActiveServiceId) {
		this.accountActiveServiceId = accountActiveServiceId;
	}
	/**
	 * @return the internetBanking
	 */
	public String getInternetBanking() {
		return internetBanking;
	}
	/**
	 * @param internetBanking the internetBanking to set
	 */
	public void setInternetBanking(String internetBanking) {
		this.internetBanking = internetBanking;
	}
	/**
	 * @return the mobileBanking
	 */
	public String getMobileBanking() {
		return mobileBanking;
	}
	/**
	 * @param mobileBanking the mobileBanking to set
	 */
	public void setMobileBanking(String mobileBanking) {
		this.mobileBanking = mobileBanking;
	}
	/**
	 * @return the phoneBanking
	 */
	public String getPhoneBanking() {
		return phoneBanking;
	}
	/**
	 * @param phoneBanking the phoneBanking to set
	 */
	public void setPhoneBanking(String phoneBanking) {
		this.phoneBanking = phoneBanking;
	}
	/**
	 * @return the debitCard
	 */
	public String getDebitCard() {
		return debitCard;
	}
	/**
	 * @param debitCard the debitCard to set
	 */
	public void setDebitCard(String debitCard) {
		this.debitCard = debitCard;
	}
	
	
}
