package com.dev.abstraction;

public  class Abstraction extends AbstractExample {

	public Abstraction() {
		System.out.println(" Cost of Abstraction class");
	}
		
	
	@Override
	void display() {
		System.out.println(" This is the implemented abstract method");
	}
	
	public static void main(String args[]) {
		Abstraction a = new Abstraction();
		a.display();
		a.show();
		
	}
}
