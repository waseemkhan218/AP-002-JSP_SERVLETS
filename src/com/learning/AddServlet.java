package com.learning;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	
	// We need to use service method only as it's a servlet life cycle.
	// HttpServletRequest and HttpServletResponse is a request and response 

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		// System.out.println("result of k: " + k);
		
		// PrintWriter object helps to print on the response object
		// It throws error which needs to be handled.
		
		PrintWriter out = res.getWriter();
		
		out.println("result of k:" + k);
	}

}
