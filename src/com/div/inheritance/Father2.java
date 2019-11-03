package com.div.inheritance;

public class Father2 extends GrandFather {

	static Father2 f = new Father2();
	String name = "Purushottam";      // Globle variable
	
	public void printName() {
		
		System.out.println(name+" "+f.name+" "+f.lastName);
		
	}

	public static void main(String[] args) {
		f.printName();
		
	}
}
