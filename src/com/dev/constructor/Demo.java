package com.dev.constructor;

import com.dev.method.MethodExample;

public class Demo {

	public static void main(String[] args) {

		int i = MethodExample.calArea(3);   //calling the method From another package
		System.out.println(i);
		System.out.println(MethodExample.j);
	}

}
