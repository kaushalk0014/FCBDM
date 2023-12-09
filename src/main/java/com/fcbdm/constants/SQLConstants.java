package com.fcbdm.constants;
public class SQLConstants {
	public static final String SQL_SAVE_BANK_DETAILS = "insert into Bank(bank_Id,bank_Name,bank_Type) values(?,?,?)";
	public static final String SQL_SAVE_BRANCH_DETAILS = "insert into Branch(branch_Id,branch_Name,branch_Address,branch_City,branch_State,branch_Country,branch_ZipCode,branch_Email,branch_Phone_Number1,branch_Phone_Number2,bank_Identifier_Code,branch_Code,cheque_Processing_Code,bank_Id) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static final String SQL_SAVE_DAYS_DETAILS = "insert into DAYS(DAY_ID,DAY) values(?,?)";
	public static final String SQL_SAVE_TIME_DETAILS = "insert into Time(Time_Id,Opening_Hours,Closing_Hours) values(?,?,?)";
	public static final String SQL_SAVE_WORKING_HOURS_DETAILS = "insert into Working_Hours(Working_Hour_Id,Day_id,time_id,branch_id) values(?,?,?,?)";
}
