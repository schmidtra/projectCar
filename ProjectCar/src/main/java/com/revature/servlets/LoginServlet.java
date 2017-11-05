package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.DAO.EmployeeDAOImpl;
import com.revature.beans.Employee;

public class LoginServlet extends HttpServlet 
{
    public LoginServlet() 
    {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		EmployeeDAOImpl eDAO = new EmployeeDAOImpl();
		ObjectMapper mapper = new ObjectMapper();
		
		Employee e = mapper.readValue(request.getParameter("employee", Employee.class));
		e = eDAO.getEmployee(e.getId());
		
		String employee = mapper.writeValueAsString(e);
		response.setContentType("application/json");
		
		PrintWriter pw = request.getWriter();
 
		if(e == null)
		{
			pw.write("");
		}
		else
		{
			pw.write(employee);
		}
	}
}
