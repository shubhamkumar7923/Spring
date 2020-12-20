package com.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.Employee;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e = (Employee) ac.getBean("emp");
		System.out.println("Employee Id: "+e.getEmpid());
		System.out.println("Employee Name: "+e.getName());
		System.out.println("Employee Salary: "+e.getSalary());
	}

}

