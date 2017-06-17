package com.springbootapp.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private static Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

	@Before(value = "execution(* com.springbootapp..*(..))")
	public void logAround(JoinPoint jp) {
		logger.debug("AOP...Before the Execution of class: " + jp.getSignature().getDeclaringTypeName() + " method:"
				+ jp.getSignature().getName());
		logger.debug("AOP...Arguments passed: " + Arrays.toString(jp.getArgs()));
	}
}