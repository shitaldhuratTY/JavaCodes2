package com.dev.collection;

public class EmployeeData2 extends EmployeeData{

	public static void main(String[] args) {
		

		Employee3 em3 = new Employee3();
		EmployeeData e = new EmployeeData();
		
		e.setEmail("shhh@gmail.com");
		e.setId(12);
		e.setName("Pooja");
		e.setPassword("ssssss");
		
		EmployeeData e1 = new EmployeeData();
		e1.setEmail("shhh@gmail.com");
		e1.setId(23);
		e1.setName("Radhu");
		e1.setPassword("ssssss");
		
		
		boolean b = em3.putEmployeeData("1", e);
		boolean b1 = em3.putEmployeeData("2", e1);
		System.out.println(b+" "+b1);
		em3.retriveEmployeeData();
		
		em3.removeEmployeeData("1");
		em3.retriveEmployeeData();
	
		em3.updateEmployeeData("2", e1);
		em3.retriveEmployeeData();
		
		System.out.println(em3.hm.get("2"));
		
	}

}
