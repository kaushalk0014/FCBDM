package com.fcbdm.controller;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankController {
	@Autowired
	private JobLauncher jobLauncher;
	@Autowired
	@Qualifier("createBankJob")
	private Job bankJob;

	@RequestMapping(value = "bankJob", method = RequestMethod.GET)
	public ModelAndView launchBankJob() {
		String status = "";
		ModelAndView modelAndView = new ModelAndView("home");

		JobParameters jobParameters = new JobParameters();
		try {
			JobExecution jobExecution = jobLauncher.run(bankJob, jobParameters);
			BatchStatus batchStatus = jobExecution.getStatus();
			modelAndView.addObject("status", batchStatus);
		} catch (JobExecutionAlreadyRunningException e) {
			status = "Job Already Running";
			modelAndView.addObject("status", status);
		} catch (JobRestartException e) {
			status = "Restart the Job";
			modelAndView.addObject("status", status);
		} catch (JobInstanceAlreadyCompleteException e) {
			status = "Job Instance Already completed";
			modelAndView.addObject("status", status);
		} catch (JobParametersInvalidException e) {
			status = "JobParameters are Invalid";
			modelAndView.addObject("status", status);
		}
		return modelAndView;
	}
}
