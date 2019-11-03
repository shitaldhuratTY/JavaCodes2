package com.dev.thread;

import javax.xml.stream.events.StartDocument;

public class MainThreadClass {

	public static void main(String[] args) {
		
		System.out.println(" Main thread started...");
		System.out.println("Main thread printing the value of i");
		
		Thread2 t2 = new Thread2 ();
		Thread t21 = new Thread(t2);
		t21.setName("Thread T2");
		t21.setPriority(1);
		t21.start();  	// Invoking internally run()  ...start execution of thread.
						// Two process working parallel.
		
		System.out.println("Thread printing the value of j");
		
		Thread3 t3 = new Thread3();
		Thread t31 = new Thread(t3);
		t31.setPriority(2);
		t31.start();
		// or new Thread(new T3()).start();
		
		Thread.currentThread().setName("Main Thread");
		Thread.currentThread().setPriority(3);
		
		System.out.println("Thread3 printing the value of k");
		
									
		
		for (int i = 1; i <=10; i++) {
			System.out.println("i ="+i);
			
		}
		
		System.out.println("Thread Name2 "+t21.getName());
		System.out.println("Thread Name3 "+Thread.currentThread().getName());
		System.out.println("Thread2 id:"+t21.getId());
		System.out.println("Thread3 id:"+t31.getId());
		System.out.println("Main Thread id:"+Thread.currentThread().getId());
		
		System.out.println("Thread2 priority:"+t21.getPriority());
		System.out.println("Thread3 priority:"+t31.getPriority());
		System.out.println("Main Thread priority:"+Thread.currentThread().getPriority());
		
		System.out.println("Main thread terminated...");
	}

}
