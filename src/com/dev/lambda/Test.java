package com.dev.lambda;

public class Test {

	public static void main(String[] args) {

		FuncInt f = () -> {				// Lambda Expression
			for (int i = 1; i<=10; i++)  // FuncInt f = () -> System.out.println(" Hi ");
			{
				System.out.println("i = "+i);
			}
		};       
	
		f.printVal();
	}

}
