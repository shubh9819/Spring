package com.basic.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	  public static void main(String [] args) {
		 ApplicationContext conn=new ClassPathXmlApplicationContext("com/basic/Spring/autowire.xml");
		    
	     student os=(student) conn.getBean("stud");
	     System.out.println(os);

	}
	
    
}
