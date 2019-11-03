package com.dev.exception;

public class CustomException extends Exception {

		public CustomException() {
			System.out.println("Exception Occured");
		}
		
		public CustomException(int i) {
			System.out.println("Int Exception Occured");
		}
		
		public CustomException(String str) {
			System.out.println(str);
			System.out.println("String Exception Occured");
		}
}
