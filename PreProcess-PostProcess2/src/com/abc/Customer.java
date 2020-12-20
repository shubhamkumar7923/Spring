package com.abc;

import org.springframework.beans.factory.InitializingBean;

public class Customer implements InitializingBean {

	private int cid;
	private String name;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside afterPropertiesSet() method of Customer");
	}
	
}
