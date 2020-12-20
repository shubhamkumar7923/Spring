package com.abc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {

	private int empid;
	private String name;
	public Employee(){
		System.out.println("Inside Constructor of Employee");
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		System.out.println("Inside setEmpid() method of Employee");
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Inside setName() method of Employee");
		this.name = name;
	}
	@PostConstruct
	public void myinit() throws Exception{
		System.out.println("Inside custom life cycle method myinit() of Employee");
	}
	@PreDestroy
	public void mycleanup() throws Exception{
		System.out.println("Inside custom life cycle method mycleanup() of Employee");
	}
}
