package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.DAO.EmployeeDAOImpl;
import com.revature.beans.Employee;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
    /**
     * Default constructor. 
     */
    public LoginServlet() 
    {
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		EmployeeDAOImpl eDAO = new EmployeeDAOImpl();
		ObjectMapper mapper = new ObjectMapper();
		
		Employee e = mapper.readValue(request.getParameter("employee", Employee.class));
		
		e = eDAO.getEmployee(e.getId());
		
		PrintWriter pw = request.getWriter();

		pw.write("{ id: " + e.getId() + " username: " + e.getUsername() + 
				", firstName: " + e.getFirstName() + ", lastName: " +
				e.getLastName() + ", midInitial: " + e.getMidInitial() + 
				", position: " + e.getPosition() + ", department: " + e.getDepartment() + 
				", reportsTo: " + e.getReportsTo() + ", street: " + e.getStreet() +
				", city: " + e.getCity() + ", state: " + e.getState() + ", zip: " +
				e.getZip() + ", country: " + e.getCountry());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
