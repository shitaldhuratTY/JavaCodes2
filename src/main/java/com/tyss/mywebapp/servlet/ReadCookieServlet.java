package com.tyss.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet
public class ReadCookieServlet extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Cookie[] cookies = req.getCookies();
		
	PrintWriter out = resp.getWriter();
	resp.setContentType("text/html");
	out.println("<head>");
	out.println("<body>");
	
	if (cookies!=null) {
		for (Cookie cookie: cookies) {
			out.println("<h3>Cookie Name = "+ cookie.getName()+"</h3>");
			out.print("<h3>Cookie value = "+ cookie.getValue()+"</h3>");
			
		}
		
	} else {
		out.print("Cookie not present");
	}
	out.print("</head>");
	out.print("</body>");
	}
}
