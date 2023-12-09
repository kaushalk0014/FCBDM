package com.fcbdm.processor;

import org.springframework.batch.item.ItemProcessor;

import com.fcbdm.bo.Bank;

public class AccountItemProcessor implements ItemProcessor<Bank, Bank> {

	@Override
	public Bank process(Bank item) throws Exception {
		// TODO Auto-generated method stub
		return item;
	}

}
