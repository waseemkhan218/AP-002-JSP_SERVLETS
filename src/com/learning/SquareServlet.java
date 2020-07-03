package com.learning;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class SquareServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
//		int k = Integer.parseInt(req.getParameter("k")); 
		
//		HttpSession session = req.getSession();
		
		// session.removeAttribute("k");  // This is how we remove session.
		
//		int k = (int) session.getAttribute("k");
		
		int k = 0;
		
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c : cookies)
		{
			if(c.getName().contentEquals("k"))
				k = Integer.parseInt(c.getValue());
		}
			
		k = k * k;
		
		PrintWriter out = res.getWriter();
		
		System.out.println("IN square ");
		
		out.println("result is K: " + k);
	}
}
