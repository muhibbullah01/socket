package com.muhib;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet 
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		int n = Integer.parseInt(req.getParameter("num1"));
		int m = Integer.parseInt(req.getParameter("num2"));
		int k = m+n;
		
		
		Cookie cookie = new Cookie("k", k + "");
		res.addCookie(cookie);
		res.sendRedirect("sq");
		
		
		
		
		//Session Management
		
		//HttpSession session = req.getSession();
		//session.setAttribute("k", k);
		
		//res.sendRedirect("sq");
		
		//req.setAttribute("k", k);
		
		// Req dispather
		//RequestDispatcher rd = req.getRequestDispatcher("sq");
		//rd.forward(req, res);
	}
}
