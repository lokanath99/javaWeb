package com.talkalot;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet 
{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
		int i =  Integer.parseInt( request.getParameter("num1"));
		int j =  Integer.parseInt( request.getParameter("num2"));
		int result = i+j;
//		System.out.println("Hey im working thanks for coding me...... " + result);
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body bgcolor='yellow'>");
		out.println("Hey im working thanks for coding me...... " + result);
		out.println("</html></body>");
	}
}
