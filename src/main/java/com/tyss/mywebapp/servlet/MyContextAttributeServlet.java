package com.tyss.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyss.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/contextAtt")
public class MyContextAttributeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

		EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
		employeeInfoBean.setEmpId(1111);
		employeeInfoBean.setEmpName("SonuMonu");
		employeeInfoBean.setAge(12);
		employeeInfoBean.setSalary(2020202);
		
		ServletContext context= getServletContext();
		context.setAttribute("emp", employeeInfoBean);
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<head>");
		out.println("<body>");
		out.println("<h3>Context Attribute has been set ...</h3>");
		out.println("</body>");
		out.println("</head>");
		
	}	// End of doGet()

} //End of Servlet
