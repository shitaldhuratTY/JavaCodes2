package com.tyss.usttyspringcore.beans;

import javax.security.auth.Destroyable;

public class Dog implements Animal{
	
	public Dog() {
		System.out.println("Dog object created");
	}
	
	private void init() {
		System.out.println("Dog init method");

	}
	
	private void destroy() {
		System.out.println("Dog destroy method");

	}
	
	@Override
	public void makeSound() {
		System.out.println("Baooooooooooo..........");
		
	}

}
