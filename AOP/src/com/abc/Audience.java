package com.abc;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {

	public void takeSeats(){
		System.out.println("The audience is taking their seats");
	}
	public void applaud(){
		System.out.println("CLAP CLAP CLAP CLAP CLAP");
	}
	public void demandRefund(){
		System.out.println("Boo! we want our money back");
	}
	public void walkOut(){
		System.out.println("Show is over. Audience is leaving");
	}
	public void m1(ProceedingJoinPoint pj) throws Throwable{
		System.out.println("Entering the method");
		pj.proceed();
		System.out.println("Existing the method");
	}
}
