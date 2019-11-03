package com.tyss.usttyspringcore.beans;



import java.util.Map;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld implements InitializingBean, DisposableBean {
	private String msg;
	private Animal animal;
	private Map<String, Integer> map;
	
	public HelloWorld() {
		System.out.println("Object created");
	}
	
	
	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg=msg;
	
	}


	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy Dog");
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(" afterPropertiesSet method ");
		
	}
}
