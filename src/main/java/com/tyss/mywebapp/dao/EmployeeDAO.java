package com.tyss.mywebapp.dao;

import com.tyss.mywebapp.dto.EmployeeInfoBean;

public interface EmployeeDAO  {
	
	public EmployeeInfoBean login(int empId, String password);
	public EmployeeInfoBean deleteEmployee(int id);
	public EmployeeInfoBean searchEmployee(int id);
	public boolean insertEmp(EmployeeInfoBean emp);
	public EmployeeInfoBean updateEmployee(int id);
	public void addEmployee(EmployeeInfoBean bean);
}
