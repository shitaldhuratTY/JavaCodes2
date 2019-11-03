package com.div.inheritance;

public class Father extends GrandFather {
	static Father f = new Father();
	String name = "Purushottam";
	
	@Override
	public void printName() {
		//String name = "Purushottam";   // Local variable
		System.out.println(name+" "+super.name+" "+f.lastName);
		super.printName();
		
	}

	public static void main(String[] args) {
		f.printName();
		
	}

}
