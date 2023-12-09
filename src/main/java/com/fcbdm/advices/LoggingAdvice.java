package com.fcbdm.advices;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;
@Service
@Aspect
public class LoggingAdvice {
 @Before(value="within(com.fcbdm.processor.*)")
	public void beforeAdvice(JoinPoint joinPoint){
	Logger logger=Logger.getLogger(joinPoint.getTarget().getClass());
logger.info("Entered into "+joinPoint.getSignature().getName());	
	}
}
