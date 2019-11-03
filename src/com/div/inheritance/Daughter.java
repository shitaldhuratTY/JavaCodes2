package com.div.inheritance;

public class Daughter extends Father {
	static Daughter d = new Daughter();
	
	@Override
	public void printName() {
		String name = "Shital";
		System.out.println(name+" "+d.name+" "+d.lastName);
	}
	public static void main(String[] args) {
		d.printName();

		
	}

}
