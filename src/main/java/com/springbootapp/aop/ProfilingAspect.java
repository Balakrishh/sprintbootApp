package com.springbootapp.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProfilingAspect {

	private static Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

	@Pointcut("execution(* com.springbootapp..*.getLatestTrendsIndia(..))")
	public void trends(){};
	
	@Around("trends()")
	public Object twitterAPIResponseTime(ProceedingJoinPoint pjp) throws Throwable{
		long start = System.currentTimeMillis();
		logger.debug("Going to call the method: "+pjp.getSignature());
		Object output = pjp.proceed();
		logger.debug("Method execution completed.");
		long elapsedTime = System.currentTimeMillis() - start;
		logger.debug("Method execution time: " + elapsedTime + " milliseconds.");
		return output;
	}
}
