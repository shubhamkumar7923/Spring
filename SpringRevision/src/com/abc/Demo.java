package com.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee e = (Employee) act.getBean("emp");
		System.out.println(e.getEmpid());
		System.out.println(e.getName());
	}

}
