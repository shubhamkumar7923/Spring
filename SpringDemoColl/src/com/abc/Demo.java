package com.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person p = (Person) ac.getBean("emp");
		System.out.println("Person Id: "+p.getPid());
		System.out.println("Person Name: "+p.getName());
		System.out.println("Hobbies :");
		String[] hb = p.getHobbies();
		for(String s:hb){
			System.out.println(s);
		}
	}

}
