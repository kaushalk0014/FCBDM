package com.fcbdm.writers;

import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fcbdm.bo.Branch;
import com.fcbdm.constants.SQLConstants;
@Repository
public class BranchItemWriterImpl implements BranchItemWriter {
	@Autowired
	private DataSource dataSource;

	@Override
	public ItemWriter<Branch> createBranchItemWriter() {
		JdbcBatchItemWriter<Branch> itemWriter = new JdbcBatchItemWriter<>();
		itemWriter.setDataSource(dataSource);
		itemWriter.setSql(SQLConstants.SQL_SAVE_BRANCH_DETAILS);
		itemWriter.setItemPreparedStatementSetter((Branch branch, PreparedStatement pst) -> {
			pst.setInt(1, branch.getBranchId());
			pst.setString(2, branch.getBranchName());
		    pst.setString(3,branch.getBranchAddress());
		    pst.setString(4,branch.getBranchCity());
		    pst.setString(5,branch.getBranchState());
		    pst.setString(6,branch.getBranchCountry());
		    pst.setString(7,branch.getBranchZipCode());
		    pst.setString(8,branch.getBranchEmail());
		    pst.setString(9,branch.getBranchPhoneNumber1());
		    pst.setString(10,branch.getBranchPhoneNumber2());
		    pst.setString(11,branch.getBankIdentifierCode());
		    pst.setString(12,branch.getBranchCode());
		    pst.setString(13,branch.getChequeProcessingCode());
		    pst.setInt(14,branch.getBankId());
			});
		return itemWriter;
	}
}





