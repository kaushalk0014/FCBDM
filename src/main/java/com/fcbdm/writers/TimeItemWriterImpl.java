package com.fcbdm.writers;

import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fcbdm.bo.Time;
import com.fcbdm.constants.SQLConstants;
@Repository
public class TimeItemWriterImpl implements TimeItemWriter {
	@Autowired
	private DataSource dataSource;

	@Override
	public ItemWriter<Time> createTimeItemWriter() {
		JdbcBatchItemWriter<Time> itemWriter = new JdbcBatchItemWriter<>();
		itemWriter.setDataSource(dataSource);
		itemWriter.setSql(SQLConstants.SQL_SAVE_TIME_DETAILS);
		itemWriter.setItemPreparedStatementSetter((Time time, PreparedStatement pst) -> {
			pst.setInt(1, time.getTimeId());
			pst.setString(2, time.getOpeningHours());
			pst.setString(3, time.getClosingHours());
		});
		return itemWriter;
	}
}
