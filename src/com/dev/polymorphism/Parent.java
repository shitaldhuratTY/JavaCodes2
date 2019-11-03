package com.dev.polymorphism;

public class Parent {


	public void test() {		// Method Overriding
		System.out.println(" No argument here");
	}
	
	public void test(int i) {		// Method 
		System.out.println(" int argument of parent class");
	}
	
	public void test2(int i, int j) {
		System.out.println(" Two int argument of parent class");
	}
	
	public static void main(String[] args) {
		 Parent p =  new Parent();
		 p.test();
	}

}
