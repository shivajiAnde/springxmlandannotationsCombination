package com.jsp.intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDriver {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		 Person person = ctx.getBean("person",Person.class);
		System.out.println(person.getAge());
		System.out.println(person.getName());
	}
}
