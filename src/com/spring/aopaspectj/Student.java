package com.spring.aopaspectj;

public class Student {

	private Integer age;
	private String name;

	public Integer getAge() {

		System.out.println("Age: " + age);
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {

		System.out.println("Name: " + name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printThrowExpcetion() {

		System.out.println("Excetption raised!!!");

		throw new IllegalArgumentException();
	}

}
