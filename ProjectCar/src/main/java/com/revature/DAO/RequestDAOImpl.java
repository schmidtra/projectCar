package com.revature.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.revature.beans.Employee;
import com.revature.beans.Request;
import com.revature.connection.ConnFactory;

public class RequestDAOImpl implements RequestDAO
{
	public static ConnFactory cf = ConnFactory.getInstance();

	@Override
	public void createRequest(Request r) throws SQLException
	{
		String[] primaryKeys = new String[1];
		primaryKeys[0] = "REQ_ID";
		
		String sql = "INSERT INTO REQUEST(REQ_EMP_ID, REQ_TYPE, REQ_DESCRIPTION, "
				+ "REQ_JUSTIFICATION, REQ_LOC_NAME, REQ_LOC_STREET, REQ_LOC_CITY, "
				+ "REQ_LOC_STATE, REQ_LOC_ZIP, REQ_COST, REQ_REIMB_AMT, REQ_REIMB_REASON "
				+ "REQ_APP_DATE, REQ_EVENT_START, REQ_EVENT_END, REQ_HOURS_MISSED "
				+ "REQ_STATUS, REQ_BENCO "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
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
			stmt.setInt(10, r.getStatus());
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
	public void changeStatus(Request r) throws SQLException
	{
		String[] primaryKeys = new String[1];
		primaryKeys[0] = "REQ_ID";
		
		String sql = "UPDATE REQUEST SET REQ_STATUS = ?";
		
		try(Connection conn = cf.getConnection())
		{
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, r.getStatus());
			
			stmt.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void updateRequest(Request r) throws SQLException
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
			stmt.setInt(10, r.getStatus());
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
	public void deleteRequest(Request r) throws SQLException
	{
		String[] primaryKeys = new String[1];
		primaryKeys[0] = "REQ_ID";

		String sql = "DELETE FROM REQUEST WHERE REQ_ID = ?";

		try(Connection conn = cf.getConnection();)
		{
			PreparedStatement  prepstmt = conn.prepareStatement(sql);
			
			prepstmt.setInt(1, r.getId());
			
			prepstmt.executeUpdate();
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
	}

	@Override
	public Request getRequestById(int id) throws SQLException
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
			int status = rs.getInt(10);
			String eventEnd = rs.getString(11);
			int signer = rs.getInt(12);
			
			r = new Request(empid, type, cost, eventStart, appDate, amt, reason,
					duration, grade, status, eventEnd, signer);
		}
		
		conn.close();
		return r;
	}
	
	@Override
	public ArrayList<Request> getApprovalsForEmployee(Employee e) throws SQLException
	{
		Connection conn = cf.getConnection();
		ArrayList<Request> approvals = new ArrayList<Request>();
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM REQUEST WHERE )
	}
	
	@Override
	public ArrayList<Request> getRequestsForEmployee(Employee e) throws SQLException
	{
		Connection conn = cf.getConnection();
		ArrayList<Request> requests = new ArrayList<Request>();
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM REQUEST WHERE REQ_EMP_ID = " + e.getId());
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
			int status = rs.getInt(10);
			String eventEnd = rs.getString(11);
			int signer = rs.getInt(12);
			
			r = new Request(empid, type, cost, eventStart, appDate, amt, reason,
					duration, grade, status, eventEnd, signer);
			
			requests.add(r);
		}
		
		conn.close();
		return requests;
	}
}
