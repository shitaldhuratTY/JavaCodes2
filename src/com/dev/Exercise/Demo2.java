package com.dev.Exercise;

public class Demo2 {

	static int i = 0101;
	static int j = 0011;
	static int a = 10;
	static int b = 15;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(i);
		System.out.println(j);
		System.out.println(i+j);
		System.out.println("---------------------");
		
		System.out.println(a++);
		System.out.println(++b);
		System.out.println(++a + b++);
		System.out.println("---------------------");
		
		String s1 = "Myran";
		String s2 = "Rani";
		System.out.println(s2=s1);
	}

}
