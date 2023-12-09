package com.fcbdm.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

import com.fcbdm.bo.WorkingHours;
@Service
public class WorkingHoursItemProcessor implements ItemProcessor<WorkingHours, WorkingHours> {

	@Override
	public WorkingHours process(WorkingHours item) throws Exception {
		// TODO Auto-generated method stub
		return item;
	}

}
