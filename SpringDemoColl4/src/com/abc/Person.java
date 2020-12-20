package com.abc;

import java.util.HashSet;

public class Person {

	private Integer pid;
	private String name;
	private HashSet<String> phone;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HashSet<String> getPhone() {
		return phone;
	}
	public void setPhone(HashSet<String> phone) {
		this.phone = phone;
	}
	
}
