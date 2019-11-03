package com.dev.collection;

import java.util.HashMap;

import com.dev.encapsulation.Dog;

public class Employee3 implements Employee2{
	HashMap<String, EmployeeData> hm = new HashMap<String, EmployeeData>();

	public boolean putEmployeeData(String s,EmployeeData e) {
		
			hm.put(s, e);
			//System.out.println(hm);
			return true;
	}


	@Override
	public boolean removeEmployeeData(String s) {
		// TODO Auto-generated method stub
		hm.remove(s);
		//System.out.println(hm);
		return true;
	}



	@Override
	public EmployeeData updateEmployeeData(String s, EmployeeData e) {
		// TODO Auto-generated method stub
		e.setName("PoojaShri");
		hm.put(s, e);		
		return null;
	}






	@Override
	public void retriveEmployeeData() {
		// TODO Auto-generated method stub
		System.out.println(hm);
		
	}











	
}
	
	