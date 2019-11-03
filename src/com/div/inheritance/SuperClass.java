package com.div.inheritance;

public class SuperClass {
   
    
	public static void main(String[] args) {
		  SuperClass s= new SuperClass(4);
		
	}
		
		public SuperClass() {
		System.out.println("Const with no-argument of SuperClass");	
		}
		
		public SuperClass(int i) {
		
			System.out.println("Const with int argument of SuperClass");	
			}
		
		public SuperClass(String s) {
			System.out.println("Const with String argument of SuperClass");	
			}
		
		public SuperClass(String s,int i) {
			System.out.println("Const with String and int argument of SuperClass");	
			}
		
		public SuperClass(int i, String s) {
			System.out.println("Const with int and String argument of SuperClass");	
			}
		
}
