package com.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person p = (Person)act.getBean("per");
		System.out.println(p.getPid());
		System.out.println(p.getName());
	}

}