package com.dev.lambda;

public class Test2 {

	public static void main(String[] args) {

		FuncInt2 f = () -> {
			try {
				int i = 24 / 2;
				System.out.println(i);
			} catch (Exception e) {
				System.out.println("Exception occure...");
			}
		};

		f.printData();

		FuncInt3 f3 = () -> System.out.println("Display data here");
		{

		};
		f3.desplay();

		FuncInt4 f4 = (int i) -> {
			for (int j = 1; j <= i; j++) {
				System.out.println(j);
			}
		};

		f4.printVal(3);

	}
}
