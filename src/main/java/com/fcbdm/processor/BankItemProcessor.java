package com.fcbdm.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

import com.fcbdm.bo.Bank;
@Service
public class BankItemProcessor implements ItemProcessor<Bank, Bank> {

	@Override
	public Bank process(Bank item) throws Exception {
		// TODO Auto-generated method stub
		return item;
	}

}
