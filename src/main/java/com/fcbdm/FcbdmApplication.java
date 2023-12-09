package com.fcbdm;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@ComponentScan(basePackages={
		"com.fcbdm.controller",
		"com.fcbdm.readers",
		"com.fcbdm.writers",
		"com.fcbdm.processor",
		"com.fcbdm.advices",
		"com.fcbdm.batch.cfg"
})
@EnableAspectJAutoProxy
@EnableBatchProcessing
public class FcbdmApplication {

	public static void main(String[] args) {
		SpringApplication.run(FcbdmApplication.class, args);
	}
}
