package com.dev.exception;

public class ExceptionHandling3 {
	public static void main(String[] args) {
		
		try {
			s();
			System.out.println("No Exception for s");
			int res = divide(10,0);
			System.out.println("No exception for dive");
			System.out.println(res);
			
		}catch(NegativeArraySizeException e) {
			System.err.println("Exception caught in catch block");
			System.err.println("getMessage():"+e.getMessage());
			e.printStackTrace();
			
		}catch(Exception e) {
			System.err.println("Exception caught in catch block");
			System.err.println("getMessage(): "+e.getMessage());
		}finally{
			System.out.println("Finally Block");
		}
	}
	
	public static int divide(int i, int j) {  // It may throw exception or not.
		int res = i/j;
		System.out.println(res);
		return 1;
	}
	
	public static void s() {
		try {
			StringBuffer sb = new StringBuffer(-1);
		}catch(Exception e) {
			System.out.println("Exception handled by catch");
		}
	}

}
