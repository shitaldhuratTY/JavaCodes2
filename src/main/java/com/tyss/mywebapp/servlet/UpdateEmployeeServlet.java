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

@WebServlet("/updateEmp")
public class UpdateEmployeeServlet extends HttpServlet {
	
private EmployeeDAO dao = new EmployeeDAOJpaImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);
		if (session != null) {
			String empIdVal = req.getParameter("empId");
			int empId = Integer.parseInt(empIdVal);
			
			EmployeeInfoBean employeeInfoBea=dao.updateEmployee(empId);
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			if (employeeInfoBea != null ) {
				out.println("<h3>Employee Data for employee Id " + empId + " updated " + "</h3>");
				
			} else {
				out.println("<h3>Employee Data for employee Id " + empId + " Not found!!! " + "</h3>");
			}
			out.println("</body>");
			out.println("</html>");
			
		} else {
			resp.sendRedirect("./loginForm.html");
		}
	}

}
