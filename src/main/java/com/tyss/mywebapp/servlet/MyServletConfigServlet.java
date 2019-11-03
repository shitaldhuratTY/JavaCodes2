package com.tyss.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServletConfigServlet  extends HttpServlet{			//http method get
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletConfig config = getServletConfig();   // we are extending HttpServlet that extend GenricServlet
		String nameVal = config.getInitParameter("name");
		
		ServletContext context= getServletContext();
		String myParamVal = context.getInitParameter("myParam");
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>My config Param value is -"+ nameVal +"</h3>");
		out.println("<h3>My context Param value is -"+ myParamVal +"</h3>");
		out.println("</html>");
		out.println("</body>");
		
	}

}
