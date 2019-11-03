package com.dev.method;

public class MethodOverloading {
	
	static MethodOverloading mg = new MethodOverloading();
	public void print() {
		System.out.println("This is print method with no-arg");
	}
	
	public int print(int i) {
		System.out.println("This is print method with int arg");
		return 1;
	}
	static String print(String str) {
		System.out.println("This is perint method with string arg");
		return "sonu";
	}

	public static void main(String[] args) {

		mg.print();
		
	}

}
