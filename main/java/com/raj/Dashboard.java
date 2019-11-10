package com.raj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Dashboard extends HttpServlet {
	
	HttpSession session;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		session = request.getSession();
		if(session.equals(null)) {
			response.sendRedirect("/login1");
		}
		else {
			response.getWriter().print("Hi "+session.getAttribute("username")+"! You Have Logged in successfully!!");
	}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		session = request.getSession();
		if(session.equals(null)) {
			response.sendRedirect("/login");
		}
		else {
			response.getWriter().print("Hi "+session.getAttribute("username")+"! You Have Logged in successfully!!");
	}
	}
}