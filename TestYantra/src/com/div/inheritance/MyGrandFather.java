package com.div.inheritance;

public class MyGrandFather {
	
	static MyGrandFather gf = new MyGrandFather();
	String lastName = "Dhurat";
	String name = "Ganesh";
	public static void main(String args[])
	{
		gf.printName();
		
	}
	
	public void printName() {
		System.out.println(name+" "+gf.lastName);
	}

}
