package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class UploadFileServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    public UploadFileServlet()
    {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		RequestDAOImpl rDAO = new RequestDAOImpl();
		String s = "";

		s = mapper.readValue(request.getParameter("file", String.class));
		
		//TODO write it somewhere somehow
	}
}
