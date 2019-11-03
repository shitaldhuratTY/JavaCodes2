package com.dev.constructor;

public class ConstructorsExample {

	public ConstructorsExample(int i){
		System.out.println(" This cons is with int arg");
		System.out.println(i);

		
	}
	public ConstructorsExample() {				// No-Argument Constructor
		System.out.println(" This cons is with no arg");
	
	}
	
	public ConstructorsExample(String s) {
		System.out.println("This cons is with String arg");
	}
	
	public ConstructorsExample(String s,int i) {
		System.out.println("This cons is with String & integer arg");
	}
	
	public ConstructorsExample(int i,String s) {
		System.out.println("This cons is with integer & string arg");
	}
	
	public static void main(String args[]) {
		ConstructorsExample ce = new ConstructorsExample();    // Constructor Overloading
		ConstructorsExample ce1 = new ConstructorsExample(2);
		ConstructorsExample ce2 = new ConstructorsExample("Shital");
		ConstructorsExample ce3 = new ConstructorsExample("Shital",1);
		ConstructorsExample ce4 = new ConstructorsExample(1,"Shital");
	}

}
