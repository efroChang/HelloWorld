package com.spring.events;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCustomEvent {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("EventBeans.xml");
		
		CustomEventPublisher publisher = (CustomEventPublisher) context.getBean("customEventPublisher");
		
		publisher.publish(); // KEY: The CustomEventHandler will do something about it.

	}

}
