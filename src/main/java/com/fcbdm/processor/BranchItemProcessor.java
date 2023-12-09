package com.fcbdm.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

import com.fcbdm.bo.Branch;
@Service
public class BranchItemProcessor implements ItemProcessor<Branch, Branch> {

	@Override
	public Branch process(Branch item) throws Exception {
		// TODO Auto-generated method stub
		return item;
	}

}
