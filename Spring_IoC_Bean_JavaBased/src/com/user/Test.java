package com.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {
	
	public static void main(String[] args) {
		
//		Product p = new Product();
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/config/config.xml");
		Student p1= (Student)ap.getBean("s");
		System.out.println(p1);
		
		Student p2= (Student)ap.getBean("s");
		System.out.println(p2);
		
		Student p3= (Student)ap.getBean("s");
		System.out.println(p3);
	}

}
