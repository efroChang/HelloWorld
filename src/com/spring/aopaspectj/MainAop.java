package com.spring.aopaspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAop {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("AopAspectJBeans.xml");

		Student student = (Student) context.getBean("student");

		student.getName();
		student.getAge();
		
		//student.printThrowExpcetion();
	}

}
