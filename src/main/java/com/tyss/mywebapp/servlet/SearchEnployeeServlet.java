package com.tyss.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tyss.mywebapp.dao.EmployeeDAO;
import com.tyss.mywebapp.dao.EmployeeDAOJpaImpl;
import com.tyss.mywebapp.dto.EmployeeInfoBean;


@WebServlet("/searchEmp1")
public class SearchEnployeeServlet extends HttpServlet{
	
	private EmployeeDAO dao = new EmployeeDAOJpaImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		HttpSession session= req.getSession(false);		//add two line in insert class also for session
		if (session != null) {
			
			// Get the form data
		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);
		
		EmployeeInfoBean employeeInfoBean = dao.searchEmployee(empId);
		resp.setContentType("text/html");
		PrintWriter out= resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		if (employeeInfoBean != null) {
			out.println("<h3>Employee Data for Employee Id"+ empId+"</h3>");
			out.println("Employee Id : "+employeeInfoBean.getEmpId());
			out.println("Employee Name : "+employeeInfoBean.getEmpName());
			out.println("Employee Age : "+employeeInfoBean.getAge());
			out.println("Employee Salary : "+employeeInfoBean.getSalary());
			out.println("Employee Age : "+employeeInfoBean.getDesignation());
			
			
		} else {
			out.println("<h2>Employee Record for Id " + empId +" Not Found!!!</h2>");
		}
		out.println("/body");
		out.println("/html");
		
		}else {
			resp.sendRedirect("./loginForm.html");
		}
		
		}
				
	
}
