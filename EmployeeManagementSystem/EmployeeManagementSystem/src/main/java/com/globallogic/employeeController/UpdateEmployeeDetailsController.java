package com.globallogic.employeeController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.globallogic.queries.Query;

/**
 * Servlet implementation class UpdateEmployeeDetailsController
 */
public class UpdateEmployeeDetailsController extends HttpServlet {
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id  = request.getParameter("id");
		
		
		Query q = new Query();
	//	q.updateDetails();
	}

}
