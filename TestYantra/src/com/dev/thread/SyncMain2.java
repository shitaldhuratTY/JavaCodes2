package com.dev.thread;

public class SyncMain2 {

	public static void main(String[] args) {
		System.out.println("SyncMain Thread started...");
		Printer p = new Printer();    // resource
		
		Thread4 t4 = new Thread4 (p);
		t4.start();
		//t4.join();
		
		new Thread5(p).start();
		
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("i = "+i);
		}
		
		System.out.println("SyncMain thread terminate...");
	}

	}


