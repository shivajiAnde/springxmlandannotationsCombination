package com.jsp.intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boy {
	
	@Autowired
	private Job job;

	@Override
	public String toString() {
		return "Boy [job=" + job + "]";
	}
}
