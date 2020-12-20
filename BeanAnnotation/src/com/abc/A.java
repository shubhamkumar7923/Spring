package com.abc;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class A {

	public A(){
		System.out.println("Inside Default constructor of A");
	}
}

