package com.jbk.datetimeup;

import java.time.Instant;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.logging.LoggingSystemFactory;
import org.springframework.stereotype.Component;

import com.jbk.dup.login;

@Component
@Aspect
public class Datetime {
	Logger logger=LoggerFactory.getLogger(login.class);
	
	/*@Before("execution(* com.jbk.controller.Login.logincre(..))")
	
	public void gettime() {
		Instant.now();
		System.out.println("before executing time is"+Instant.now());
	}
	*/
	@After("execution(* com.jbk.controller.Login.logincre(..))")
	public void afterexe() {
		
		logger.info("just user login"+Instant.now());
		
	
		
	}
	/*@Around("execution(* com.jbk.controller.Login.logincre(..))")
	public Object difference(ProceedingJoinPoint joinpoint ) throws Throwable {
		
		long beforetime=System.currentTimeMillis();
		
		Object o=joinpoint.proceed();
		long aftertime=System.currentTimeMillis();
		
		logger.info("the difference is"+(aftertime- beforetime));
		
		
		return o;
	}*/

}
