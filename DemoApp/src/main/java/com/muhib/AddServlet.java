package com.muhib;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet 
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int n = Integer.parseInt(req.getParameter("num1"));
		int m = Integer.parseInt(req.getParameter("num2"));
		int k = m+n;
		PrintWriter out = res.getWriter();
		out.println("The Addition of two number is: " +k);
	}
}
