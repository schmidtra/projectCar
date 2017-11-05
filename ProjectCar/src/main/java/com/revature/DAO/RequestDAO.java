package com.revature.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.beans.Employee;
import com.revature.beans.Request;

public interface RequestDAO 
{
	public void createRequest(Request r) throws SQLException;
	public void updateRequest(Request r) throws SQLException;
	public void deleteRequest(Request r) throws SQLException;
	public Request getRequestById(int id) throws SQLException;
	public ArrayList<Request> getRequestsForEmployee(Employee e) throws SQLException;
	public ArrayList<Request> getApprovalsForEmployee(Employee e) throws SQLException;
	public void changeStatus(Request r) throws SQLException;
}
