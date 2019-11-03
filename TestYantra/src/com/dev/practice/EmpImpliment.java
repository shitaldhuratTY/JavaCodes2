package com.dev.practice;

import java.util.HashMap;

public class EmpImpliment implements EmployeeInt{
	HashMap<String ,EmployeeData> hm = new HashMap<String ,EmployeeData>();

	@Override
	public boolean putEmp(String s, EmployeeData e) {
		// TODO Auto-generated method stub
		hm.put(s, e);
		return true;
	}

	@Override
	public boolean removeEmp(String s) {
		hm.remove(s);
		return false;
	}

	@Override
	public EmployeeData updateEmp(String s, EmployeeData e) {
		e.setName("Radha");
		hm.put(s, e);
		return null;
	}

	@Override
	public void retriveEmp() {
		System.out.println(hm);
		// TODO Auto-generated method stub
		
	}
	

}
