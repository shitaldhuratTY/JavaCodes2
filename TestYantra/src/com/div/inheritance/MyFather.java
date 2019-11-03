package com.div.inheritance;

public class MyFather extends MyGrandFather {
	
	static MyFather f = new MyFather();
	String name = "Purushottam";
	
	@Override
	public void printName() {
		//String name = "Purushottam";   // Local variable
		System.out.println(name+" "+super.name+" "+f.lastName);
		
	}

	public static void main(String[] args) {
		f.printName();
		
	}


}
