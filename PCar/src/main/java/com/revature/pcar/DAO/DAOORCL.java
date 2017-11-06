package com.revature.pcar.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.pcar.ConnFactory;
import com.revature.pcar.beans.Employee;
import com.revature.pcar.beans.Request;

public class DAOORCL implements DAO{
	ConnFactory cf = ConnFactory.getInstance();
	public List getRequest(int id) {
		
		return null;
	}

	public List getApproval(int id) {
		
		return null;
	}

	public Employee loginValidation(String loginUsername, String loginPassword) throws SQLException  {
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();

		ResultSet rs = null;


			rs = stmt.executeQuery("SELECT * FROM EMPLOYEE WHERE EMP_USERNAME = '" + loginUsername + "' AND EMP_PASSWORD = '" + loginPassword +"'");

		

		

		Employee loginOne = null;

		

		while(rs.next())

		{

			long newId = rs.getInt(1);

			String username = rs.getString(2);

			String password = rs.getString(3);

			String firstName = rs.getString(4);

			String lastName = rs.getString(5);

			String midInitial = rs.getString(6);

			String position = rs.getString(7);

			long department = rs.getInt(8);

			

			

			long reportsTo = rs.getInt(9);

			String street = rs.getString(10);

			String city = rs.getString(11);

			String state = rs.getString(12);

			String zip = rs.getString(13);

			

			loginOne = new Employee((int)newId, username,/* password,*/ firstName,

					lastName, midInitial, (int)department, position, (int)reportsTo, 

					street, city, state, zip, password);

		}

		

		

		

		

		

		return loginOne;

	}

	public List<Request> getRequestById(int id) {
		List<Request> list = new ArrayList<Request>();

		
		String sql = "SELECT REQ_ID, REQ_EMP_ID, REQ_TYPE, REQ_COST, REQ_EVENT_START, REQ_APP_DATE, REQ_REIMB_AMT, REQ_DESCRIPTION, REQ_JUSTIFICATION, REQ_HOURS_MISSED, REQ_STATUS, REQ_EVENT_END, REQ_BENCO, REQ_LOC_NAME, REQ_LOC_STREET, REQ_LOC_CITY, REQ_LOC_STATE, REQ_LOC_STATE, REQ_LOC_ZIP FROM REQUEST WHERE REQ_EMP_ID = " + id;
		
		ResultSet rs = null;
		try(Connection conn = cf.getConnection()) {
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(new Request(rs.getInt(1),rs.getInt(2), rs.getString(3), rs.getDouble(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getString(8),rs.getString(9), rs.getString(10), rs.getInt(11), rs.getString(12), rs.getInt(13), rs.getString(14), rs.getString(15), rs.getString(16),rs.getString(17),rs.getString(18)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return list;
	}

	@Override
	public List<Request> getRequestBySigner(int id) {
List<Request> list = new ArrayList<Request>();

		
		String sql = "SELECT REQ_ID, REQ_EMP_ID, REQ_TYPE, REQ_COST, REQ_EVENT_START, REQ_APP_DATE, REQ_REIMB_AMT, REQ_DESCRIPTION, REQ_JUSTIFICATION, REQ_HOURS_MISSED, REQ_STATUS, REQ_EVENT_END, REQ_BENCO, REQ_LOC_NAME, REQ_LOC_STREET, REQ_LOC_CITY, REQ_LOC_STATE, REQ_LOC_ZIP, REQ_LOC_ZIP FROM REQUEST WHERE REQ_BENCO = " + id;
		
		ResultSet rs = null;
		try(Connection conn = cf.getConnection()) {
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(new Request(rs.getInt(1),rs.getInt(2), rs.getString(3), rs.getDouble(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getString(8),rs.getString(9), rs.getString(10), rs.getInt(11), rs.getString(12), rs.getInt(13), rs.getString(14), rs.getString(15), rs.getString(16),rs.getString(17),rs.getString(18)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return list;
	}


}
