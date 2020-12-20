package com.abc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Employee implements InitializingBean,DisposableBean,BeanNameAware,BeanFactoryAware,
                   ApplicationContextAware{

	private int empid;
	private String name;
	private String beanname;
	private BeanFactory fact;
	private ApplicationContext ac;
	public Employee(){
		System.out.println("Inside Default Constructor of Employee");
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
	@Override
	public void setApplicationContext(ApplicationContext ac) throws BeansException {
		// TODO Auto-generated method stub
		this.ac=ac;
		System.out.println("Inside setApplicationContext() method of Employee");
	}
	@Override
	public void setBeanFactory(BeanFactory fct) throws BeansException {
		// TODO Auto-generated method stub
		this.fact=fct;
		System.out.println("Inside setBeanFactory() method of Employee");
	}
	@Override
	public void setBeanName(String beanname) {
		// TODO Auto-generated method stub
		this.beanname=beanname;
		System.out.println("Inside setBeanName() method of Employee "+beanname);
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside destroy() method of Employee");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside afterPropertiesSet() method of Employee");
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
