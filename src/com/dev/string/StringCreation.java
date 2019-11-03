package com.dev.string;

public class StringCreation {

	public static void main(String[] args) {
		String str;
		str = "Hello";
		String str2 = "JAVA";
		String str3 = new String("Programing");
		
		StringBuffer sb = new StringBuffer("Hello");
		StringBuilder sbb = new StringBuilder("Java");
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(sb);
		System.out.println(sbb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());   //length of string + 16 is capacity
		
	}

}
