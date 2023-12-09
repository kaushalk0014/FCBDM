/*
 * Copyright (c) 2017, 2018, FCBDM and/or its affiliates. All rights reserved.
 * FCBDM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.fcbdm.bo;

public class Time {
private Integer timeId;
private String openingHours;
private String closingHours;
/**
 * @return the timeId
 */
public Integer getTimeId() {
	return timeId;
}
/**
 * @param timeId the timeId to set
 */
public void setTimeId(Integer timeId) {
	this.timeId = timeId;
}
/**
 * @return the openingHours
 */
public String getOpeningHours() {
	return openingHours;
}
/**
 * @param openingHours the openingHours to set
 */
public void setOpeningHours(String openingHours) {
	this.openingHours = openingHours;
}
/**
 * @return the closingHours
 */
public String getClosingHours() {
	return closingHours;
}
/**
 * @param closingHours the closingHours to set
 */
public void setClosingHours(String closingHours) {
	this.closingHours = closingHours;
}

}
