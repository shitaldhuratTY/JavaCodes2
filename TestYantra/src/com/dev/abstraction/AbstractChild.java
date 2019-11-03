package com.dev.abstraction;

public abstract class AbstractChild extends AbstractParent {

	abstract void display();
	
	public static void main(String[] args) {
		//AbstractChild ac = new AbstractChild();
		//ac.name();
		//ac.location();

	}
	
	@Override
	void name() {
		System.out.println("Shital");
	}
	
	@Override
	void location() {
		System.out.println("Maharashtra");
	}


}
