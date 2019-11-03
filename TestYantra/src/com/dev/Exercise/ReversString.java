package com.dev.Exercise;

public class ReversString {

	public static void main(String[] args) {

			String str = "Shital";
			String reverse="";
			int length = str.length();
			for(int i=length-1; i>=0; i--)
			{
				reverse = reverse + str.charAt(i);
			}
			System.out.println("Reverse string is : ");
			System.out.println(reverse);
	}

}
 