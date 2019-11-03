package com.div.inheritance;

public class Subclass extends SuperClass {
 
	public Subclass() {
		super();
		System.out.println("Const without argument of SubClass");
	}
	
	public Subclass(int i) {
		super();
		System.out.println("Const with int argument of SubClass");
	}
	
	public Subclass(int i, String s) {
		super();
		System.out.println("Const with int and String argument of SubClass");
	}
	
	public Subclass( String s, int i) {
		super();
		System.out.println("Const with String and int argument of SubClass");
	}


	public static void main(String[] args) {
		Subclass su = new Subclass(5);
	
	}

}
