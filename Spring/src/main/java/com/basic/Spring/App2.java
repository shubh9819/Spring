package com.basic.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
	public static void main(String[] args) {
		ApplicationContext con1n=new ClassPathXmlApplicationContext("com/basic/Spring/aspects.xml");
		paymentservices ov=(paymentservices) con1n.getBean("payment");
		ov.makepayment();
	}

}
