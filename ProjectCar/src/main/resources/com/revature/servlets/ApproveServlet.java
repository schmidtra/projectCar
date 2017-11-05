package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.DAO.RequestDAOImpl;
import com.revature.beans.Request;

/**
 * Servlet implementation class ApproveServlet
 */
public class ApproveServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    public ApproveServlet() 
    {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		RequestDAOImpl rDAO = new RequestDAOImpl();
		ObjectMapper mapper = new ObjectMapper();
		
		Request r = mapper.readValue(request.getParameter("request", Request.class));
		
		rDAO.changeStatus(r);
	}
}
