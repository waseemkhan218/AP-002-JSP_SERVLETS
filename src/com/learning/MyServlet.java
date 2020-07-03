package com.learning;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		PrintWriter out = response.getWriter();
		out.print("Hi ");
		
		// Servlet Context is used if you have some config like environment key and value which are common for all
		// the servlet in the app.
		
//		ServletContext ctx = getServletContext();
//		String str = ctx.getInitParameter("phone");
//		out.println(str);
		
		// Servlet Config is used if you want to have some config for specific servlet.
		
		ServletConfig conf = getServletConfig();
		String str = conf.getInitParameter("name");
		out.println(str);
	}

}
