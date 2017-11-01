package com.revature.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.beans.Employee;
import com.revature.beans.Request;
import com.revature.connection.ConnFactory;

public class RequestDAOImpl implements RequestDAO
{
	public static ConnFactory cf = ConnFactory.getInstance();

	@Override
	public void createRequest(Request r) 
	{
		String[] primaryKeys = new String[1];
		primaryKeys[0] = "REQ_ID";
		
		String sql = "INSERT INTO REQUEST(REQ_EMP_ID, REQ_TYPE, REQ_COST, "
				+ "REQ_EVENT_START, REQ_APP_DATE, REQ_AMOUNT, REQ_REASON, "
				+ "REQ_DURATION, REQ_GRADE, REQ_STATUS, REQ_EVENT_END, REQ_SIGNER "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try(Connection conn = cf.getConnection();)
		{
			PreparedStatement stmt = conn.prepareStatement(sql, primaryKeys);
			
			stmt.setInt(1, r.getEmpId());
			stmt.setString(2, r.getType());
			stmt.setDouble(3, r.getCost());
			stmt.setString(4, r.getEventStart());
			stmt.setString(5, r.getAppDate());
			stmt.setDouble(6, r.getAmount());
			stmt.setString(7, r.getReason());
			stmt.setString(8, r.getDuration());
			stmt.setString(9, r.getGrade());
			stmt.setString(10, r.getStatus());
			stmt.setString(11, r.getEventEnd());
			stmt.setInt(12, r.getSigner());
			
			stmt.executeUpdate();
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
	}

	@Override
	public void updateRequest(Request r) 
	{	
		String[] primaryKeys = new String[1];
		primaryKeys[0] = "REQ_ID";
	
		String sql = "UPDATE REQUEST SET REQ_EMP_ID = ?, REQ_TYPE = ?, "
				+ "REQ_COST = ?, REQ_EVENT_START = ?, REQ_APP_DATE = ?, "
				+ "REQ_AMT = ?, REQ_REASON = ?, REQ_DURATION = ?, REQ_GRADE = ?, "
				+ "REQ_STATUS = ?, REQ_EVENT_END = ?, REQ_SIGNER = ?";
		
		try(Connection conn = cf.getConnection())
		{
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setInt(1, r.getEmpId());
			stmt.setString(2, r.getType());
			stmt.setDouble(3, r.getCost());
			stmt.setString(4, r.getEventStart());
			stmt.setString(5, r.getAppDate());
			stmt.setDouble(6, r.getAmount());
			stmt.setString(7, r.getReason());
			stmt.setString(8, r.getDuration());
			stmt.setString(9, r.getGrade());
			stmt.setString(10, r.getStatus());
			stmt.setString(11, r.getEventEnd());
			stmt.setInt(12, r.getSigner());
			
			stmt.executeUpdate();
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
	}

	@Override
	public void deleteRequest(Request r) 
	{
		
	}

	@Override
	public Request getRequestById(int id) 
	{
		Connection conn = cf.getConnection();
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM REQUEST WHERE REQ_ID = " + id);
		Request r = null;
		
		while(rs.next())
		{
			int empid = rs.getInt(1);
			String type = rs.getString(2);
			double cost = rs.getDouble(3);
			String eventStart = rs.getString(4);
			String appDate = rs.getString(5);
			double amt = rs.getDouble(6);
			String reason = rs.getString(7);
			String duration = rs.getString(8);
			String grade = rs.getString(9);
			String status = rs.getString(10);
			String eventEnd = rs.getString(11);
			int signer = rs.getInt(12);
			
			r = new Request(empid, type, cost, eventStart, appDate, amt, reason,
					duration, grade, status, eventEnd, signer);
		}
		
		conn.close();
		return r;
	}
}
