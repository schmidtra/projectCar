package com.revature.DAO;

import java.sql.SQLException;

import com.revature.beans.Request;

public interface RequestDAO 
{
	public void createRequest(Request r) throws SQLException;
	public void updateRequest(Request r) throws SQLException;
	public void deleteRequest(Request r) throws SQLException;
	public Request getRequestById(int id) throws SQLException;
}
