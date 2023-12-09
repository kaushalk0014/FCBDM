package com.fcbdm.writers;

import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fcbdm.bo.WorkingHours;
import com.fcbdm.constants.SQLConstants;
@Repository
public class WorkingHoursItemWriterImpl implements WorkingHoursItemWriter {
	@Autowired
	private DataSource dataSource;

	@Override
	public ItemWriter<WorkingHours> createWorkingHoursItemWriter() {
		JdbcBatchItemWriter<WorkingHours> itemWriter = new JdbcBatchItemWriter<>();
		itemWriter.setDataSource(dataSource);
		itemWriter.setSql(SQLConstants.SQL_SAVE_WORKING_HOURS_DETAILS);
		itemWriter.setItemPreparedStatementSetter((WorkingHours workingHours, PreparedStatement pst) -> {
			pst.setInt(1, workingHours.getWorkingHourId());
			pst.setInt(2, workingHours.getDayId());
			pst.setInt(3, workingHours.getTimeId());
			pst.setInt(4, workingHours.getBranchId());
		});
		return itemWriter;
	}
}
