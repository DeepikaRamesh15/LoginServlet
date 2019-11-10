package com.raj;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		
		System.out.println(session);
		
		if(request.getParameter("username").equals(request.getParameter("password"))) {
			session.setAttribute("username", request.getParameter("username"));
			response.sendRedirect("/dashboard");
//			request.getRequestDispatcher("/dashboard.jsp");
		}
		else {
			session.setAttribute("invalid", "Please enter the valid credentials to login..");
			response.sendRedirect("login.jsp");
//			request.getRequestDispatcher("/login.jsp");
			
//			session.invalidate();
		}
	}
}