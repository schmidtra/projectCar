package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

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
