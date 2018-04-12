package com.spring.annotation;

import org.springframework.beans.factory.annotation.Required;

public class Student {

	private Integer age;
	private String name;

	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	@Required
	public void setAge(Integer age) {
		this.age = age;
	}

}
