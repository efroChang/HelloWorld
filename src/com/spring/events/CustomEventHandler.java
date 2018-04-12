package com.spring.events;

import org.springframework.context.ApplicationListener;

public class CustomEventHandler implements ApplicationListener<CustomEvent> {

	@Override
	public void onApplicationEvent(CustomEvent event) {

		// Do whatever to react to the Event object.
		
		System.out.println(event.toString());

	}

}
