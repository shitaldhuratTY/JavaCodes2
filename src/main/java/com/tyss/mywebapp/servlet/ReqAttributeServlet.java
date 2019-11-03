package com.tyss.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyss.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/reqAttribute")
public class ReqAttributeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  EmployeeInfoBean employeeInfoBean	 =(EmployeeInfoBean) req.getAttribute("employee");
	  
	  
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			out.println("<head>");
			out.println("<body>");
			out.println("<h3>Employee Details are -</h3>");
			out.println("Id - "+employeeInfoBean.getEmpId());
			out.println("Name - "+employeeInfoBean.getEmpName());
			out.println("Age - "+employeeInfoBean.getAge());
			out.println("Salary - "+employeeInfoBean.getSalary());
			out.println("Designation - "+employeeInfoBean.getDesignation());
			out.println("</body>");
			out.println("</head>");
	}

}
