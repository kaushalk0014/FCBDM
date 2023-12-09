package com.fcbdm.writers;

import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fcbdm.bo.Days;
import com.fcbdm.constants.SQLConstants;
@Repository
public class DaysItemWriterImpl implements DaysItemWriter {
	@Autowired
	private DataSource dataSource;

	@Override
	public ItemWriter<Days> createDaysItemWriter() {
		JdbcBatchItemWriter<Days> itemWriter = new JdbcBatchItemWriter<>();
		itemWriter.setDataSource(dataSource);
		itemWriter.setSql(SQLConstants.SQL_SAVE_DAYS_DETAILS);
		itemWriter.setItemPreparedStatementSetter((Days days, PreparedStatement pst) -> {
			pst.setInt(1, days.getDayId());
			pst.setString(2, days.getDay());
			
		});
		return itemWriter;
	}
}
