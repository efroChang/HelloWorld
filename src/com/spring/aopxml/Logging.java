package com.spring.aopxml;

public class Logging {

	public void beforeAdvice() {

		System.out.println("Going to setup Student profile...");
	}

	public void afterAdvice() {

		System.out.println("Student profile has been set up...");
	}

	public void afterReturningAdvice(Object retVal) {

		System.out.println("Returning value is: " + retVal);
	}

	public void afterThrowingAdvice(IllegalArgumentException e) {

		System.out.println("There has been an exception: " + e.toString());
	}
}
