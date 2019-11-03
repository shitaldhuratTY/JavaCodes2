package com.dev.thread;

public class Printer {
	public void printValue(int i, String thread) {
		for (int j = 0; j <=i; j++) {
			System.out.println("Thread: "+thread+" "+"j = "+j);
			
		}
	}

}
