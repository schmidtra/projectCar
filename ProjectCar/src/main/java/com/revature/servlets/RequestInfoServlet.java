package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Servlet implementation class RequestInfoServlet
 */
public class RequestInfoServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    public RequestInfoServlet() 
    {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		RequestDAOImpl rDAO = new RequestDAOImpl();
		ArrayList<Request> requests = new ArrayList<Request>();
		String s = "";
		requests = rDAO.getRequestsForEmployee(e);
		ObjectMapper mapper = new ObjectMapper();
		
		String requestsJSON = mapper.writeValueAsString(requests);
		response.setContentType("application/json");
		
		PrintWriter out = response.getWriter();
		out.write(requestsJSON);
	}
}
