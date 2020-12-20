package com.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {


	public static void main (String[] args){
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee e=(Employee)ac.getBean("emp");
		System.out.println("Emp Id: "+ e.getEmpid());
		System.out.println("Emp Name: "+e.getName());
		System.out.println("Salary: "+e.getSalary());
	}
	
	
}