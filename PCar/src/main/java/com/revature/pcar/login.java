package com.revature.pcar;

import java.io.IOException;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.revature.pcar.DAO.DAOORCL;
import com.revature.pcar.beans.Credential;
import com.revature.pcar.beans.Employee;
import com.revature.pcar.beans.ProtectedEmp;

/**
 * Servlet implementation class login
 */
public class login extends HttpServlet {
	ConnFactory cf = ConnFactory.getInstance();
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Driver myDriver = new oracle.jdbc.driver.OracleDriver();
		   try {
			DriverManager.registerDriver( myDriver );
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ObjectMapper mapper = new ObjectMapper();
		Credential c = mapper.readValue(request.getParameter("credentials"), Credential.class);
		DAOORCL dao = new DAOORCL();
		Employee e = null;
		try {
			 e = dao.loginValidation(c.getUsername(), c.getPassword());
		} catch (SQLException b) {
			// TODO Auto-generated catch block
			b.printStackTrace();
		}
		ProtectedEmp pemp = new ProtectedEmp(e.getId(), e.getFirstName(), e.getLastName());
		String json = new Gson().toJson(pemp);
		response.getWriter().write(json);
	}

}
