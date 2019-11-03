package com.dev.exception;

public class ExcetionHandling {

	public static void main(String[] args) {
		try {
			s();
		}catch(Exception e) {
			System.out.println("Exception Occured");
			e.printStackTrace();     // It gives information about exception.
		}finally {
			System.out.println("This is finally block");
		}
		System.out.println("Code after Exception");
			
	}
	public static void s() {
		StringBuffer ab = new StringBuffer(-1);   // NegativeArraySizeException
	}

}
