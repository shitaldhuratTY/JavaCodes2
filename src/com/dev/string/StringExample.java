package com.dev.string;

public class StringExample {

	public static void main(String[] args) {
		String str = "ShitalDhurat";
		String str1 = "shital Dhurat";
		int length = str.length();
		System.out.println("Output for length() "+length);
		
		int l = str1.length();
		System.out.println("Output for length() "+l);
		
		char []ch = str.toCharArray();
		System.out.println("Output for toCharArray() "+ch[9]);
		
		char c =str.charAt(9);
		System.out.println("Output for charAt() "+c);
		
		boolean b = str.equals(str1);
		System.out.println("Output for equals() "+b);
		
		boolean b2 = str.equalsIgnoreCase(str1);
		System.out.println("Output for equalsIgnoreCase() "+b2);
		
		boolean v = str.contains("al");
		System.out.println("Output for contains() "+v);
		
		String g = str.replace('S', 'm');
		System.out.println("Output for replace() "+g);
		
		int i = str.indexOf('c');
		System.out.println("Output for indexOf() "+i);
		
		String s = str.toUpperCase();
		System.out.println("Output for toUpperCase() "+s);
		
		String s1 = str.toLowerCase();
		System.out.println("Output for toLowerCase() "+s1);
		
		String a = str.substring(3);       // One input argument
		System.out.println("Output of substring() "+a);
		
		
		String q = str.substring(3, 11);     // Two input argument
		System.out.println("Output of substring(3, 7) "+q);
		

	}

}
