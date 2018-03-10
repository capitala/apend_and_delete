package org.chalenges.solutions.append_and_delete.logManager;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LoggingAspects {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Before("org.chalenges.solutions.append_and_delete.logManager.PointCutDefinitions.getStartLogger()")
	public void before(JoinPoint joinPoint) {
		logger.info("Have entered the " + joinPoint);
	}

	@AfterThrowing("org.chalenges.solutions.append_and_delete.logManager.PointCutDefinitions.getEndLogger()")
	public void afterThrowing(JoinPoint joinPoint) {
		logger.info("Exception in  the " + joinPoint);
	}

	@AfterReturning(value = "org.chalenges.solutions.append_and_delete.logManager.PointCutDefinitions.getEndLogger()", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		logger.info("Successfully executed the " + joinPoint);
	}
}
