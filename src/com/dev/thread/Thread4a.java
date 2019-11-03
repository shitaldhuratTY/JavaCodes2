package com.dev.thread;

public class Thread4a {
	
Printer2 p2;
	
	public Thread4a(Printer2 pre2) {
		p2 = pre2;
	}
	
	private void run() {
	
		p2.printData(10, "Thread 4");

}
}
