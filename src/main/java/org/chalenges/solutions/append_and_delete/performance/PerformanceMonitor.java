package org.chalenges.solutions.append_and_delete.performance;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.chalenges.solutions.append_and_delete.entity.RecordEntity;
import org.chalenges.solutions.append_and_delete.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class PerformanceMonitor {
	@Autowired
	private RecordRepository repo;
	@Around("@annotation(TimeTracker)")
	public String around(ProceedingJoinPoint joinPoint){
		String result=null;
		long startTime=System.currentTimeMillis();
		try {
			result=(String) joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		repo.save(new RecordEntity((String)joinPoint.getArgs()[0],(String)joinPoint.getArgs()[1],result,System.currentTimeMillis()-startTime));
		return result;
	}

}
