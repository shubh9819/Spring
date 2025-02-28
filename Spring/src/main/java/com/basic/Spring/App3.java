
package com.basic.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {
	
	public static void main(String[] args) {
		ApplicationContext conn3=new ClassPathXmlApplicationContext("com/basic/Spring/allannotaion.xml");
		
		annotaions abcd=(annotaions) conn3.getBean("student");
		System.out.println(abcd.getName());
		
		abcd.getAge();
		System.out.println(abcd.hello("testing"));
		try {
			abcd.printThrowException();
		}catch(Exception e) {
			
		}
	}

}
