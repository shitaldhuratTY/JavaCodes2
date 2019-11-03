package com.dev.thread;

public class Printer2 {

	synchronized public void printData(int i, String thread) {
		for (int m = 0; m <=i; m++) {
			System.out.println("Thread: "+thread+" "+"m = "+m);
			
		}
	}
}
