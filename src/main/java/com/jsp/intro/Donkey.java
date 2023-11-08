package com.jsp.intro;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Donkey {
	
	{
		System.out.println("eeheeheehe");
	}
}
