package com.abc;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e = (Employee) ctx.getBean("emp");
		System.out.println("Employee Name is: "+e.getEmpid());
		System.out.println("Employee Name is: "+e.getName());
		ctx.close();
	}

}

