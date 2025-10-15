package com.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Product;

public class Test {
	
	public static void main(String[] args) {
		
//		Product p = new Product();
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/config/config.xml");
		Product p1= (Product)ap.getBean("p");
//		p1.setPname("umang");
		System.out.println(p1.getPid());
		System.out.println(p1.getPname());
		System.out.println(p1.getPrice());
		System.out.println(p1.getBrand());
	}

}
