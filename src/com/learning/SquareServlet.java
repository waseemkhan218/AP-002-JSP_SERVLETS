package com.learning;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
//		int k = Integer.parseInt(req.getParameter("k")); 
		
		HttpSession session = req.getSession();
		
		// session.removeAttribute("k");  // This is how we remove session.
		
		int k = (int) session.getAttribute("k");
		
		k = k * k;
		
		PrintWriter out = res.getWriter();
		
		System.out.println("IN square ");
		
		out.println("result is K: " + k);
	}
}
