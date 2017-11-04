package com.revature.DAO;

import java.sql.SQLException;

import com.revature.beans.Employee;

public interface EmployeeDAO 
{
	public void createEmployee(Employee e) throws SQLException;
	public void updateEmployee(Employee e) throws SQLException;
	public Employee getEmployee(int id) throws SQLException;
	public Employee getEmployeeByLogin(String username, String password) throws SQLException;
	public void deleteEmployee(Employee e) throws SQLException;
}
