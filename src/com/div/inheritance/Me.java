package com.div.inheritance;

public class Me extends MyFather {
	
static Me m = new Me();
	
	@Override
	public void printName() {
		String name = "Shital";
		System.out.println(name+" "+super.name+" "+m.lastName);
	}
	public static void main(String[] args) {
		m.printName();
	}

}
