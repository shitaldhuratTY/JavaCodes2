package com.tyss.mywebapp.operation;

import com.tyss.mywebapp.dto.EmployeeInfoBean;

public interface EmployeeDao {
	

		public EmployeeInfoBean searchEmployee(int id);
		public boolean insertEmp(EmployeeInfoBean emp);
	}


