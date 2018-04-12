package com.spring.noxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		
		HelloWorld hello = context.getBean(HelloWorld.class);
		
		hello.setMessage( "Spring is here!!!");
		hello.getMessage();

	}

}
