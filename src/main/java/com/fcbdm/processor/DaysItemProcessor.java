package com.fcbdm.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

import com.fcbdm.bo.Days;
@Service
public class DaysItemProcessor implements ItemProcessor<Days, Days> {

	@Override
	public Days process(Days item) throws Exception {
		// TODO Auto-generated method stub
		return item;
	}

}
