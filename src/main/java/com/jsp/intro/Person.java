package com.jsp.intro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	private String name;
	
	private int age;

	public String getName() {
		return name;
	}
	
	@Value("shivaji")
	public void setName(String name) {
		System.out.println("name is setting");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	@Value("22")
	public void setAge(int age) {
		System.out.println("age is setting");
		this.age = age;
	}
	
	
}
