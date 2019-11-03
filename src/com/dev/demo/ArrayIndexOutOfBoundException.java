package com.dev.demo;

public class ArrayIndexOutOfBoundException extends IndexOutOfBoundsException{

	private int i;
	public ArrayIndexOutOfBoundException(int i) {
		this.i=i;
	}
	@Override
	public String getMessage() {
		return " index out of bound "+i;
	}
	
	}

