package com.dev.polymorphism;


public class Child extends Parent{

	public void test() {
		super.test();
		 	System.out.print("No argument of child class");
		 	System.out.println(" Runtime Example ");
		 	}
		 	
			
		   public void test(int i) {	
			   super.test();
			 System.out.print(" Int argument of child class ");
			 System.out.println(" Runtime Example ");
			}
			
			
//			public void test2() {
//				System.out.println(" method overriding run");
//			}

			public static void main(String[] args) {
				Child c = new Child();
				c.test();
	}

}
