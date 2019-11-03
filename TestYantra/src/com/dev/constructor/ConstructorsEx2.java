package com.dev.constructor;

public class ConstructorsEx2 {

	public ConstructorsEx2() {
		System.out.println("Constructor with No argument");

	}
	
	public ConstructorsEx2(int i) {
		System.out.println("Constructor with argument");

	}
	
	public ConstructorsEx2(char c) {
		System.out.println("Constructor with one argument");

	}
	
	public ConstructorsEx2(char c,String s) {
		System.out.println("Constructor with char & string argument");

	}
	
	public ConstructorsEx2(String s, char c) {
		System.out.println("Constructor with string & char argument");

	}
	
	
	
	
	public static void main(String args[]) {
		ConstructorsEx2 ce = new ConstructorsEx2();    // Constructor Overloading
		ConstructorsEx2 ce1 = new ConstructorsEx2(2); 
		ConstructorsEx2 ce2 = new ConstructorsEx2('A'); 
		ConstructorsEx2 ce3 = new ConstructorsEx2('B',"monu"); 
		ConstructorsEx2 ce4 = new ConstructorsEx2("monu",'B'); 
		// System.out.println(ce4);         // getting Address of argument
		
	}

}
