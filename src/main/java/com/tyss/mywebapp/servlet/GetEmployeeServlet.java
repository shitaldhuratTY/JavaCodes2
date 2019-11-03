package com.tyss.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getEmployeeServlet")
public class GetEmployeeServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		if (empId == 101) {
			
			out.println("<h2>Employee Details for emp Id"+ empId +"- </h2>");
			out.println("Id = 101<br/>");
			out.println("Name = Sheetal<br/>");
			out.println("Age = 23<br/>");
			out.println("Phone = 9999999999<br/>");
			out.println("Salary = 50999<br/>");
			
		} else {
			out.println("<h2 style=\"color:red\">Record Not Found for empId"+ empId + "</h2>");
		}
		out.println("</body>");
		out.println("</html>");
		
	}

}
