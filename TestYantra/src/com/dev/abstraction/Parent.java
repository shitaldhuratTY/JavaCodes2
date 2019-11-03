package com.dev.abstraction;

public  class Parent extends AbstractChild{
 
	public void display() {
		System.out.println("display method executed");
	}
	
	public static void main(String args[]) {
		Parent p = new Parent();
		p.name();
		p.location();
		p.display();
	}

}
