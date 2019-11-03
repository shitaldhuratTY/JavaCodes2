package com.dev.encapsulation;

public class StudentData {

	public static void main(String[] args) {
		Students s = new Students();
		s.setRegno(2001);
		s.setName("Shital");
		s.setEmail("shital@gmail.com");
		s.setPassword("12345");
		
	
		System.out.println("Regno: "+s.getRegno());
		System.out.println("Name : "+s.getName());
		System.out.println("Email: "+s.getEmail());
		System.out.println("****************");
	}

}
