package com.raj;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet(
//    name = "HelloAppEngine",
//    urlPatterns = {"/hello"}
//)
public class Login extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {

    String str = request.getParameter("username");
    String pass = request.getParameter("password");
//	HttpSession session=request.getSession(false);
//	System.out.println(session.getAttribute("name"));
    if((str.equals("Raj")) && (pass.equals("raju"))) {
//        response.setContentType("text/plain");
//        response.setCharacterEncoding("UTF-8");
    	response.getWriter().print("Login Success");
//    	session.setAttribute("name", str);
    }
    else {
    	response.getWriter().print("Invalid Credentials");
    	response.sendRedirect("index.jsp");
    	response.sendRedirect("http://www.google.com");
    }

  }
}