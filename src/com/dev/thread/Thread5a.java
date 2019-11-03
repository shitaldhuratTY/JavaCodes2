package com.dev.thread;

public class Thread5a {
Printer2 p2;
	
	public Thread5a(Printer2 pre2) {
		p2 = pre2;
	}
	
	public void run() {
		p2.printData(10, "Thread 5");
			
		}

}
