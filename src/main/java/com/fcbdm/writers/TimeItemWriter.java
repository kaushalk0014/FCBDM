package com.fcbdm.writers;

import org.springframework.batch.item.ItemWriter;

import com.fcbdm.bo.Time;

public interface TimeItemWriter  {
public ItemWriter<Time> createTimeItemWriter();
}
