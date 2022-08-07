package com.globallogic.hello;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/home3")
public class MySecondServerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servicing");
		RequestDispatcher rd=request.getRequestDispatcher("/home3.html");
		rd.forward(request, response);
		
	}
}
