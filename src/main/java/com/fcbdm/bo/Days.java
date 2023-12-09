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
public class Days {
private Integer dayId;
private String day;
/**
 * @return the dayId
 */
public Integer getDayId() {
	return dayId;
}
/**
 * @param dayId the dayId to set
 */
public void setDayId(Integer dayId) {
	this.dayId = dayId;
}
/**
 * @return the day
 */
public String getDay() {
	return day;
}
/**
 * @param day the day to set
 */
public void setDay(String day) {
	this.day = day;
}

}
