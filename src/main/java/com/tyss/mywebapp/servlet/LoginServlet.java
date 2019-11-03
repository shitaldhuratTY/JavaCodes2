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

@WebServlet("/login1")
public class LoginServlet extends HttpServlet {

	EmployeeDAO dao = new EmployeeDAOJpaImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// get the form data
		String empIdVal = req.getParameter("empId");
		String passwordVal = req.getParameter("password");

		int empId = Integer.parseInt(empIdVal);

		EmployeeInfoBean employeeInfoBean = dao.login(empId, passwordVal);
		if (employeeInfoBean != null) {
			HttpSession session = req.getSession(true); // session create
			session.setAttribute("employeeInfo", employeeInfoBean);

			resp.sendRedirect("./homePage.html");

		} else {
			resp.sendRedirect("./loginForm.html");
		}
	}

}
