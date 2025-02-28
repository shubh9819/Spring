package com.basic.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
    public static void main( String[] args )
    {
    	
       ApplicationContext con=new ClassPathXmlApplicationContext("com/basic/Spring/config.xml");
       beans ob=(beans)con.getBean("emp");
       person obs=(person) con.getBean("pr");
       System.out.println(obs);
       
       //System.out.println(ob);
    }
}
