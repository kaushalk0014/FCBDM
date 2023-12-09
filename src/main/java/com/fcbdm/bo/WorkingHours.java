/*
 * Copyright (c) 2017, 2018, FCBDM and/or its affiliates. All rights reserved.
 * FCBDM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.fcbdm.bo;

public class WorkingHours {
private Integer workingHourId;
private Integer dayId;
private Integer timeId;
private Integer branchId;
/**
 * @return the workingHourId
 */
public Integer getWorkingHourId() {
	return workingHourId;
}
/**
 * @param workingHourId the workingHourId to set
 */
public void setWorkingHourId(Integer workingHourId) {
	this.workingHourId = workingHourId;
}
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

}
