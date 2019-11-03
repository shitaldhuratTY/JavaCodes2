package com.dev.abstraction;

public abstract class AbstractExample {
	public AbstractExample() {
		
		System.out.println(" Constructor of AbstractExample class");
	}
	abstract void display();
	
	public void show() {
		System.out.println(" Concrete method of abstract class");
	}
	
	public static void main(String[] args) {

		
	}

}
