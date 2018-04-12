package com.spring.aopaspectj;

import org.aspectj.lang.annotation.*;

@Aspect
public class Logging {

	// KEY: Set up the Pointcut
	@Pointcut("execution(* com.spring.aopaspectj.Student.*(..))")
	private void selectAll() {
		// This is the Advice.
	}

	@Before("selectAll()")
	public void beforeAdvice() {

		System.out.println("Going to set up Student profile...");
	}

	@After("selectAll()")
	public void afterAdvice() {
		
		System.out.println("Student profile has been set up...");
	}

	@AfterReturning(pointcut = "selectAll()", returning = "retVal")
	public void afterReturningAdvice(Object retVal) {

		System.out.println("Returning: " + retVal.toString());
	}

	@AfterThrowing(pointcut = "selectAll()", throwing = "ex")
	public void afterThrowingAdvice(IllegalArgumentException ex) {
		
		System.out.println("There has been an exception: " + ex.toString());
	}
}
