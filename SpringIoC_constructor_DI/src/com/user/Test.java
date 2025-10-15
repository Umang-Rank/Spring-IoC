package com.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Person;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/config/config.xml");
		Person p = (Person) ap.getBean("p");
		
//		System.out.println(p);
		
		System.out.println(p.getPid());
		System.out.println(p.getPname());
		System.out.println(p.getAdr());
		System.out.println(p.getContact());
		System.out.println(p.getEmail());
		System.out.println(p.getMarks());
		System.out.println();
		p.getContact().forEach(c->System.out.println(c));
		System.out.println();
		p.getEmail().forEach(c->System.out.println(c));
		System.out.println();
		p.getMarks().forEach((c,c1)->System.out.println(c+"="+c1));
		
	}

}
