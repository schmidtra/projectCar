package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ApprovalsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public ApprovalsServlet() 
    {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
//		RequestDAOImplArrayList<Request> = new RequestDAOImpl();
//		ArrayList<Request> requests = new ArrayList<Request>();
//		String s = "";
//		requests = rDAO.getRequestsForEmployee(e);
//		ObjectMapper mapper = new ObjectMapper();
//		
//		String requestsJSON = mapper.writeValueAsString(requests);
//		response.setContentType("application/json");
//		
//		PrintWriter out = response.getWriter();
//		out.write(requestsJSON);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	}
}
