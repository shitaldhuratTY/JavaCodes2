package com.dev.collection;

import java.util.TreeSet;

import com.dev.encapsulation.Dog;


public class Emp1  {

	public static void main(String[] args) {
		TreeSet<EmployeeData> ts = new TreeSet<EmployeeData>();
		
		EmployeeData d = new EmployeeData();
		d.setName(" Shital");
		d.setId(444);
		d.setEmail(" shital@gmail.com");
		d.setPassword(" shital");
		
		EmployeeData d1 = new EmployeeData();
		d1.setName(" Monika");
		d1.setId( 222);
		d1.setEmail(" mona@gmail.com");
		d1.setPassword(" mona");
		
		EmployeeData d2 = new EmployeeData();
		d2.setName(" Vishal");
		d2.setId(333);
		d2.setEmail(" vishal@gmail.com");
		d2.setPassword(" vishal");
		
		ts.add(d);
		ts.add(d1);
		ts.add(d2);
		
		System.out.println(ts);
	}

}
