package com.tyss.mywebapp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.http.HTTPException;

import com.tyss.mywebapp.dao.EmployeeDAO;
import com.tyss.mywebapp.dao.EmployeeDAOJpaImpl;


public class AddEmployeeServlet extends HttpServlet{
	
	private EmployeeDAO dao = new EmployeeDAOJpaImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);
		
		String empIdVal1 = req.getParameter("empId");
		int age = Integer.parseInt(empIdVal1);
		String empName,designation;
		empName=req.getParameter("empName");
		
		String empIdVal2 = req.getParameter("empId");
		int salary = Integer.parseInt(empIdVal2);
	
		designation=req.getParameter("designation");
		HttpSession session = req.getSession(true);
		
		try {
			SaveEmployeeControl ctrl = new SaveEmployeeControl();
			ctrl.addNewEmployee(empId, empName, age, salary, designation);
			resp.sendRedirect("Success");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
