package com.dev.practice;



public class Employee extends EmployeeData {

	public static void main(String[] args) {
		
		EmpImpliment ee = new EmpImpliment();
		
		EmployeeData e= new EmployeeData();
		e.setEmail("shit@gmail.com");
		e.setId(10);
		e.setName("Shital");
		e.setPassword("sssss");
		
		EmployeeData e1= new EmployeeData();
		e1.setEmail("mnn@gmail.com");
		e1.setId(20);
		e1.setName("mona");
		e1.setPassword("mmmm");
		
		boolean b1 = ee.putEmp("1", e);
		boolean b2 = ee.putEmp("2", e1);
		
		System.out.println(b1+" "+b2);
		ee.retriveEmp();
		
		ee.updateEmp("2", e);
		ee.retriveEmp();
		
		ee.removeEmp("2");
		ee.retriveEmp();

	}

}
