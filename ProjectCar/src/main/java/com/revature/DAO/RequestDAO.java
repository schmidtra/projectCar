package com.revature.DAO;

import com.revature.beans.Request;

public interface RequestDAO 
{
	public void createRequest(Request r);
	public void updateRequest(Request r);
	public void deleteRequest(Request r);
	public Request getRequestById(int id);
}
