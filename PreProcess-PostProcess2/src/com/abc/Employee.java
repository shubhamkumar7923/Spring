package com.abc;

import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean {

	private int empid;
	private String name;
	public Employee(){
		//System.out.println("Inside Constructor of Employee");
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		//System.out.println("Inside setEmpid() method of Employee");
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		//System.out.println("Inside setName() method of Employee");
		this.name = name;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside afterPropertiesSet() method of Employee");
	}
	
}
