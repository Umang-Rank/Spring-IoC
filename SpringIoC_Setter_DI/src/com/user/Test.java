package com.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Person;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ap= new ClassPathXmlApplicationContext("com/config/config.xml");
		Person p1= (Person) ap.getBean("p");
		System.out.println(p1.getPid());
		System.out.println(p1.getPname());
		System.out.println(p1.getAdr());
		System.out.println(p1.getContact());
		System.out.println(p1.getEmail());
		System.out.println(p1.getMarks());
	}

}
