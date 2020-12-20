package com.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person p = (Person) ac.getBean("emp");
		System.out.println("Employee Id: "+p.getPid());
		System.out.println("Employee Name: "+p.getName());
	}

}
