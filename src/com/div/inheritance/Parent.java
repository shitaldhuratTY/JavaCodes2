package com.div.inheritance;

public class Parent {

	//@Override
	
	final void test() {
		System.out.println("No argument here");
	}
	
	static void test1() {
		System.out.println("No argument here");
	}
	
	public void test2() {
		System.out.println("No argument here");
	}
	
	public static void main(String[] args) {
		
		 Parent p =  new Parent();
		 p.test();
		
	}

}
