package com.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Juggler j = (Juggler)ctx.getBean("jug");
		try {
			j.perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
