package com.abc;

import java.util.HashMap;


public class Person {

	private Integer pid;
	private String name;
	private HashMap<String, String> education;
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
	public HashMap<String, String> getEducation() {
		return education;
	}
	public void setEducation(HashMap<String, String> education) {
		this.education = education;
	}
	
}
