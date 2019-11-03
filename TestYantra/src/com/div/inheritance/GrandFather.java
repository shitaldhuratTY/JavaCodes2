package com.div.inheritance;

public class GrandFather {
	
	static GrandFather gf = new GrandFather();
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
