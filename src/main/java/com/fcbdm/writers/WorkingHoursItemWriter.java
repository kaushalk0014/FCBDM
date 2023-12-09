package com.fcbdm.writers;

import org.springframework.batch.item.ItemWriter;

import com.fcbdm.bo.WorkingHours;

public interface WorkingHoursItemWriter  {
public ItemWriter<WorkingHours> createWorkingHoursItemWriter();
}
