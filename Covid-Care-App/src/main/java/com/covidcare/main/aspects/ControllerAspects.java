package com.covidcare.main.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ControllerAspects {
	
	private Logger logger = LoggerFactory.getLogger(ControllerAspects.class);
	
	@Before("execution(* com.covidcare.main.controllers.*.*(..))")
	public void beforePage(JoinPoint jp) {
		String className = jp.getTarget().getClass().getName();
		String methodName = jp.getSignature().getName();
		logger.info(String.format("Before :: MethodName => %s :: ClassName => %s", methodName, className));
	}

}
