package com.dev.thread;

public class Test {

	public static void main(String[] args) {

	System.out.println("T2 thread started...");
		
		for (int j = 1; j <=100; j++) {
			System.out.println("j ="+j);
		}
		
		for (int j = 1; j <=10; j++) {		// This thread have to wait until first thred process complete.
			System.out.println("j ="+j);
		}
		
		System.out.println("T2 thread terminated...");
	}

}
