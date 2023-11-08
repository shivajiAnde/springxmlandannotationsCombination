package com.jsp.intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DonkeyDriver {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Donkey donkey = ctx.getBean("donkey",Donkey.class);
		System.out.println(donkey);
	}
}
