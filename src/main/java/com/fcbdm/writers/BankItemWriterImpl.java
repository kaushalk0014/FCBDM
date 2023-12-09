package com.fcbdm.writers;

import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fcbdm.bo.Bank;
import com.fcbdm.constants.SQLConstants;
@Repository
public class BankItemWriterImpl implements BankItemWriter {
	@Autowired
	private DataSource dataSource;

	@Override
	public ItemWriter<Bank> createBankItemWriter() {
		JdbcBatchItemWriter<Bank> itemWriter = new JdbcBatchItemWriter<>();
		itemWriter.setDataSource(dataSource);
		itemWriter.setSql(SQLConstants.SQL_SAVE_BANK_DETAILS);
		itemWriter.setItemPreparedStatementSetter((Bank bank, PreparedStatement pst) -> {
			pst.setInt(1, bank.getBankId());
			pst.setString(2, bank.getBankName());
		    pst.setString(3,bank.getBankType());
		    
			});
		return itemWriter;
	}
}





