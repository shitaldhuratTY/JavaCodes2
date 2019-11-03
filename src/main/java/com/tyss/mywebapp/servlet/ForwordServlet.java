package com.tyss.mywebapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyss.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/forward")
public class ForwordServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
		employeeInfoBean.setEmpId(999);
		employeeInfoBean.setEmpName("Abcd");
		employeeInfoBean.setAge(45);
		
		req.setAttribute("employee", employeeInfoBean);
		
	RequestDispatcher dispatcher = req.getRequestDispatcher("/reqAttribute");
		dispatcher.forward(req, resp);
	}

}

