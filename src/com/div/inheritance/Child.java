package com.div.inheritance;

public class Child extends Parent {
	
/*	public void test() {					// Final method can't override from parent
 *		System.out.println("Welcome here");
 	}
 	*/
	
   /* public void test1() {			// This instance method can not override the static method from parent.
	*	System.out.println("static method can't override");
	}
	*/
	
	public void test2() {
		System.out.println("public method can override");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.test();

		
	}

}
