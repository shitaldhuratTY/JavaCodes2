package com.tyss.mywebapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tyss.mywebapp.dao.EmployeeDAO;
import com.tyss.mywebapp.dao.EmployeeDAOJpaImpl;

@WebServlet("/delete")
public class DeleteServlet  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id= req.getParameter("id");
		
		EmployeeDAO dao=new EmployeeDAOJpaImpl();
		dao.deleteEmployee(Integer.parseInt(id));
		
		HttpSession session=req.getSession(false);
		session.invalidate();
	resp.sendRedirect("/login.jsp");
	}

}
