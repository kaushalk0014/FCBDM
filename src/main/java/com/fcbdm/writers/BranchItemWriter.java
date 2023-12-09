package com.fcbdm.writers;

import org.springframework.batch.item.ItemWriter;

import com.fcbdm.bo.Branch;

public interface BranchItemWriter {
	public ItemWriter<Branch>   createBranchItemWriter();

}
