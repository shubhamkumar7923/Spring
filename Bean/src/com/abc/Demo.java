package com.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		A a1 = (A) ctx.getBean("obja");
		System.out.println("Value of a1: "+a1);
		
		A a2 = (A) ctx.getBean("obja");
		System.out.println("Value of a2: "+a2);
	}

}
