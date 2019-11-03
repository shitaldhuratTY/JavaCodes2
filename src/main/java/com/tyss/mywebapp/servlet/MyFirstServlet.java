package com.tyss.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myFirstServlet")   //configer with servlet
public class MyFirstServlet extends HttpServlet {		// we want to creat servlets
	
	public MyFirstServlet() {
		
		System.out.println("Inistaniation");
		
	}
	
	public void init() {
		System.out.println("init");
	}
	
	private void destroid() {
		System.out.println("destroy");

	}

	
	@Override				// doGet() it is the method to handle the http request
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Date date = new Date();
	
	System.out.println("service");
	System.out.println("changes");
	
	resp.setContentType("text/html");   // it will tell there is text in that html
								    	// setting the content type
	resp.setHeader("refresh", "1");		//1> for set time automaticaly
	PrintWriter out = resp.getWriter();	//get the stream to write the data
	
	
	//writing html in the stream

	
	/*out.println("<head>");
	out.println("<meta http-equiv=\"refresh\"content=\"1\">");			//2>  for set time automaticaly
	out.println("</head>");*/
	
	out.println("<html>");
	out.println("<body>");
	out.println("<h2>Current System Date & Time<br/>");
	out.println(date);
	out.println("</h2>");
	out.println("</body>");
	out.println("</html>");

	}

}
