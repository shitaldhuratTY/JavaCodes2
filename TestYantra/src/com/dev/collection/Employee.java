package com.dev.collection;

import java.util.HashSet;

import com.dev.encapsulation.Dog;

public class Employee {

	public static void main(String[] args) {
		
		HashSet<EmployeeData>hs = new HashSet<EmployeeData>();
		EmployeeData d = new EmployeeData();
		d.setName(" Shital");
		d.setId(111);
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
		
		d.setEmail(" ssss@gmail.com");
		d1.setEmail(" momo@gmail.com");
		
		boolean b1 = hs.add(d);
		boolean b2 = hs.add(d1);
		boolean b3 = hs.add(d2);
		System.out.println("Output of add(): "+b1+" "+b2+""+b3);
		System.out.println(hs);
		System.out.println("Size of HashSet hs : "+hs.size());
		System.out.println("Output of cotains(): "+hs.contains(d));
		
	}

}
