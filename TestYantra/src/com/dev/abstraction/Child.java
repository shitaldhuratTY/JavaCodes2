package com.dev.abstraction;

public class Child extends AbstractParent {
	
	@Override
	void name() {
		System.out.println("Mona");
	}
	
	@Override
	void location() {
		System.out.println("Maharashtra");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.name();
		c.location();

	}

}
