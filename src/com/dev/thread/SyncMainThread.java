package com.dev.thread;

public class SyncMainThread {

	public static void main(String[] args) throws InterruptedException {
			
		System.out.println("SyncMain Thread started...");
		Printer p = new Printer();    // resource
		
		Thread4 t4 = new Thread4 (p);
		t4.start();
		//t4.join();
		
		new Thread5(p).start();
		
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("i = "+i);
		}
		
		System.out.println("SyncMain thread terminate...");
	}

}

// If we want data in perticuler manner we will use sleep(), join() or synchronized.
