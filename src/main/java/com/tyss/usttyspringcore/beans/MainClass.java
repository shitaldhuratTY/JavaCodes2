package com.tyss.usttyspringcore.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("authorbean.xml");
		
		Author author=context.getBean(Author.class);
		System.out.println(author.getName());
		author.getWrite().write();
	}

}
