package com.jsp.intro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
		private int rollNo;
		
		private String name;

		
		public Student(@Value("101")int rollNo, @Value("appasyamkiri")String name) {
			super();
			this.rollNo = rollNo;
			this.name = name;
		}


		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", name=" + name + "]";
		}
		
		
}
