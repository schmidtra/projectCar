package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Servlet implementation class UploadFileServlet
 */
public class UploadFileServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    public UploadFileServlet()
    {
    	RequestDAOImplArrayList<Request> = new RequestDAOImpl();
		ArrayList<Request> requests = new ArrayList<Request>();
		String s = "";
		requests = rDAO.getRequestsForEmployee(e);
		
		String requestsJSON = mapper.writeValueAsString(requests);
		response.setContentType("application/json");
		
		PrintWriter out = response.getWriter();
		out.write(requestsJSON);
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
}
