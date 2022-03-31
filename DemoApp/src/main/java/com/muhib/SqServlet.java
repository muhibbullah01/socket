package com.muhib;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SqServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
		
		int k = 0;
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c: cookies) {
			k = Integer.parseInt(c.getValue());
		}
		k = k*k;
		
		PrintWriter out = res.getWriter();
		out.println("Request is "+ k);
		System.out.println("sq called");
	}

}
