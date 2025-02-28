package com.basic.Spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class logging {
	@Pointcut("execution(* com.basic.Spring.*.*(..))")
	private void selectall() {}
	@Before("selectall()")
	public void before() {
		System.out.println("going to setup profile...");
	}
	@Around("execution(* com.basic.Spring.annotaions.hello(..))")
	public Object LogExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable{
		long starttime=System.currentTimeMillis();
		Object result=joinPoint.proceed();
		long endtime=System.currentTimeMillis();
		System.out.println("method"+ joinPoint.getSignature()+"executed in"+(endtime-starttime)+"ms");
		
		
		return result;
		
	}
	@After("selectall()")
	public void after() {
		System.out.println("student profile has been setup");
	}
	
	@AfterReturning(pointcut="selectall()",returning="retVal")
	public void afterreturn(Object retVal) {
		System.out.println("Retuurning:"+retVal.toString());
	}
	
	@AfterThrowing(pointcut="selectall()",throwing="ex")
	public void afterthrw(IllegalArgumentException ex) {
		System.out.println("there has been an exception:"+ex.toString());
		
	}

}
