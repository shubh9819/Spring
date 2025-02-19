package com.basic.Spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class myaspect {
	@Before("execution(public void com.basic.Spring.paymentservices.makepayment())")
	public void printbefore() {
		System.out.println("payment started  ...");
	}
	

}
