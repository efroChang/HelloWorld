package com.spring.events;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEvent {

	public static void main(String[] args) {

		// KEY: ConfigurableApplicationContext
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("EventBeans.xml");

		HelloWorld hello = (HelloWorld) context.getBean("helloWorld");

		// Start Event
		context.start();

		hello.getMessage();

		// Stop Event
		context.stop();

	}

}