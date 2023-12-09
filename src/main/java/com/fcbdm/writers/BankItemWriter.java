package com.fcbdm.writers;

import org.springframework.batch.item.ItemWriter;

import com.fcbdm.bo.Bank;

public interface BankItemWriter  {
public ItemWriter<Bank> createBankItemWriter();
}
