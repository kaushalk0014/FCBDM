package com.fcbdm.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

import com.fcbdm.bo.Time;
@Service
public class TimeItemProcessor implements ItemProcessor<Time, Time> {

	@Override
	public Time process(Time item) throws Exception {
		// TODO Auto-generated method stub
		return item;
	}

}
