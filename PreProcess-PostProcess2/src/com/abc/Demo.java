package com.abc;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e = (Employee) ctx.getBean("emp");
		System.out.println("Employee Name is: "+e.getName());
		Customer c = (Customer)ctx.getBean("cus");
		System.out.println("Customer Name is: "+c.getName());
		ctx.close();
	}

}
