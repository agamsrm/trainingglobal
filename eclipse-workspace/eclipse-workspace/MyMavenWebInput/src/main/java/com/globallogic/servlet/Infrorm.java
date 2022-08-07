package com.globallogic.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 
 */
public class Infrorm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher rs = request.getRequestDispatcher("/myhome.html");
		rs.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		RequestDispatcher rs = request.getRequestDispatcher("/Inform.jsp");

		request.setAttribute("name", name);
		request.setAttribute("password", pass);
		rs.forward(request, response);

	}

}
