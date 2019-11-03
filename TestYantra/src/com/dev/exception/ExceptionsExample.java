package com.dev.exception;

public class ExceptionsExample {

	public static void main(String[] args) {

			/*double d = 10.0;
			*double q = 0.0;
			 System.out.println("Result: "+d/q);
			 */
		System.out.println("Print statment before ");
		
		t();// NegativeArraySizeException
		System.out.println("Print statment after");
	}
	
	public static void s() {
		StringBuffer ab = new StringBuffer(-1);   // NegativeArraySizeException
	}
	
	public static void t() {
		s();   // NegativeArraySizeException
	}
	

}
