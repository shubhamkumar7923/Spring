package com.abc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Properties;

public class Person {

	private int pid;
	private String name;
	private String[] hobbies;
	private ArrayList<String> email;
	private HashMap<String, String>education;
	private HashSet<String>phone;
	private Properties percentage;
	
	public Properties getPercentage() {
		return percentage;
	}
	public void setPercentage(Properties percentage) {
		this.percentage = percentage;
	}
	public HashSet<String> getPhone() {
		return phone;
	}
	public void setPhone(HashSet<String> phone) {
		this.phone = phone;
	}
	public HashMap<String, String> getEducation() {
		return education;
	}
	public void setEducation(HashMap<String, String> education) {
		this.education = education;
	}
	public ArrayList<String> getEmail() {
		return email;
	}
	public void setEmail(ArrayList<String> email) {
		this.email = email;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	
}
