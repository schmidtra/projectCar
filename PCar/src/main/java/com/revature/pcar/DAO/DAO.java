package com.revature.pcar.DAO;

import java.sql.SQLException;
import java.util.List;

import com.revature.pcar.beans.Employee;
import com.revature.pcar.beans.Request;

public interface DAO {
	public List getRequest(int id);
	public List getApproval(int id);
	public Employee loginValidation(String loginUsername, String loginPassword) throws SQLException;
	public List<Request> getRequestById(int id);
	public List<Request> getRequestBySigner(int id);
}
