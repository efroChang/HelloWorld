package com.spring.events;

// KEY
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;;

public class CustomEventPublisher implements ApplicationEventPublisherAware { // KEY

	// KEY
	private ApplicationEventPublisher publisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {

		this.publisher = publisher;
	}

	public void publish() {

		// KEY
		CustomEvent event = new CustomEvent(this);

		publisher.publishEvent(event);
	}
}
