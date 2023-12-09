package com.fcbdm.writers;

import org.springframework.batch.item.ItemWriter;

import com.fcbdm.bo.Days;

public interface DaysItemWriter  {
public ItemWriter<Days> createDaysItemWriter();
}
