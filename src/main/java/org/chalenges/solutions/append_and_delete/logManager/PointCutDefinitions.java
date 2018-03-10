package org.chalenges.solutions.append_and_delete.logManager;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointCutDefinitions {
	@Pointcut("execution(* org.chalenges.solutions.append_and_delete.controller.*.*(..))")
	public void getStartLogger(){}
	@Pointcut("execution(* org.chalenges.solutions.append_and_delete.controller.*.*(..))")
	public void getEndLogger(){}
	

}
