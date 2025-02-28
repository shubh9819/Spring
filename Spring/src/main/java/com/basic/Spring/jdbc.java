package com.basic.Spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class jdbc {
	public static void main(String[] args) {
		ApplicationContext connn=new ClassPathXmlApplicationContext("com/basic/Spring/jdbcc.xml");	
		Empdao dao=(Empdao) connn.getBean("edao");
		int save=dao.saveemp(new employee(1012,"shubham","ndsjnasnjajs",19000));
		//System.out.println(save);
		List<employee> list=dao.getdata();
		for(employee e:list)
		{
			System.out.println(e.getId());
			System.out.println("........");
			System.out.println(e.getName());
			System.out.println("......");
			System.out.println(e.getMail());
			System.out.println(".....");
			System.out.println(e.getSal());
		}
	}
	
}
