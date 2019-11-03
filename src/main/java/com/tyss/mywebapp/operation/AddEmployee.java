package com.tyss.mywebapp.operation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyss.mywebapp.dao.EmployeeDAO;
import com.tyss.mywebapp.dao.EmployeeDAOJpaImpl;
import com.tyss.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/successEmp")
public class AddEmployee extends HttpServlet {
	private EmployeeDAO dao=new EmployeeDAOJpaImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		EmployeeInfoBean empBean=new EmployeeInfoBean();
		
		String empIdVal=req.getParameter("empId");
		int empId=Integer.parseInt(empIdVal);
		
		String empNameVal=req.getParameter("empName");
		
		String empAgeVal=req.getParameter("age");
		int age=Integer.parseInt(empAgeVal);
		
		String empSalVal=req.getParameter("salary");
		int empSal=Integer.parseInt(empSalVal);
		
		String empDesigVal=req.getParameter("designation");
				
		empBean.setEmpId(empId);
		empBean.setEmpName(empNameVal);
		empBean.setSalary(empSal);
		empBean.setAge(age);
		empBean.setDesignation(empDesigVal);
		
		boolean booln=dao.insertEmp(empBean);
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		if(booln==true) {
			out.println("<h3>Employee Data added to the Database</h3>");
		}else {
			out.println("<h3>Failed to add Employee Data");
		}
		
	}
}
