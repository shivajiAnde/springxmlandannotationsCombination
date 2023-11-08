package com.jsp.intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JobDriver {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		 Boy boy = ctx.getBean("boy",Boy.class);
		System.out.println(boy);
	}
}
