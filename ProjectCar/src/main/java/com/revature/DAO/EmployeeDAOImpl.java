package com.revature.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.beans.Employee;
import com.revature.connection.ConnFactory;

public class EmployeeDAOImpl implements EmployeeDAO
{
	public static ConnFactory cf = ConnFactory.getInstance();
	
	// TODO write to linking tables???
	public void createEmployee(Employee e) 
	{
		String[] primaryKeys = new String[1];
		primaryKeys[0] = "EMP_ID";
		
		String sql = "INSERT INTO EMPLOYEE(EMP_USERNAME, EMP_PASSWORD,"
				+ "EMP_FNAME, EMP_LNAME, EMP_MINIT, EMP_POSITION, EMP_DEPARTMENT"
				+ "EMP_REPORTSTO, EMP_ADR_STREET, EMP_ADR_CITY, EMP_ADR_STATE,"
				+ "EMP_ADR_ZIP, EMP_ADR_COUNTRY) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try(Connection conn = cf.getConnection();)
		{
			PreparedStatement stmt = conn.prepareStatement(sql, primaryKeys);
			stmt.setString(1, e.getUsername());
			stmt.setString(2, e.getPassword());
			stmt.setString(3, e.getFirstName());
			stmt.setString(4, e.getLastName());
			stmt.setString(5, e.getMidInitial());
			stmt.setInt(6, e.getDepartment());
			stmt.setString(7, e.getPosition());
			stmt.setInt(8, e.getReportsTo());
			stmt.setString(9, e.getStreet());
			stmt.setString(10, e.getCity());
			stmt.setString(11, e.getState());
			stmt.setInt(12, e.getZip());
			stmt.setString(13, e.getCountry());
			
			stmt.executeUpdate();
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
	}

	public void updateEmployee(Employee e) 
	{
		String[] primaryKeys = new String[1];
		primaryKeys[0] = "EMP_ID";
		
		String sql = "UPDATE EMPLOYEE SET EMP_USERNAME = ?, EMP_PASSWORD = ?, "
				+ "EMP_FNAME = ?, EMP_LNAME = ?, EMP_MINIT = ?, EMP_POSITION = ?, "
				+ "EMP_DEPARTMENT = ?, EMP_REPORTSTO = ?, EMP_ADR_STREET = ?, "
				+ "EMP_ADR_CITY = ?, EMP_ADR_STATE = ?, EMP_ADR_ZIP = ?, "
				+ "EMP_ADR_COUNTRY = ?";
		
		try(Connection conn = cf.getConnection())
		{
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, e.getUsername());
			stmt.setString(2, e.getPassword());
			stmt.setString(3, e.getFirstName());
			stmt.setString(4, e.getLastName());
			stmt.setString(5, e.getMidInitial());
			stmt.setString(6, e.getPosition());
			stmt.setInt(7, e.getDepartment());
			stmt.setInt(8, e.getReportsTo());
			stmt.setString(9, e.getStreet());
			stmt.setString(10, e.getCity());
			stmt.setString(11, e.getState());
			stmt.setInt(12, e.getZip());
			stmt.setString(13, e.getCountry());
			
			stmt.executeUpdate();
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
	}

	public Employee getEmployee(int id) throws SQLException
	{
		Connection conn = cf.getConnection();
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEE WHERE EMP_ID = " + id);
		Employee e = null;
		
		while(rs.next())
		{
			int newId = rs.getInt(1);
			String username = rs.getString(2);
			String password = rs.getString(3);
			String firstName = rs.getString(4);
			String lastName = rs.getString(5);
			String midInitial = rs.getString(6);
			String position = rs.getString(7);
			int department = rs.getInt(8);
			int reportsTo = rs.getInt(9);
			String street = rs.getString(10);
			String city = rs.getString(11);
			String state = rs.getString(12);
			int zip = rs.getInt(13);
			String country = rs.getString(14);
			
			e = new Employee(newId, username, password, firstName,
					lastName, midInitial, position, department, reportsTo, 
					street, city, state, zip, country);
		}
		
		conn.close();
		return e;
	}

	public void deleteEmployee(Employee e)
	{
		String[] primaryKeys = new String[1];
		primaryKeys[0] = "EMP_ID";

		String sql = "DELETE FROM EMPLOYEE WHERE EMP_ID = ?";

		try(Connection conn = cf.getConnection();)
		{
			PreparedStatement  prepstmt = conn.prepareStatement(sql);
			
			prepstmt.setInt(1, e.getId());
			
			prepstmt.executeUpdate();
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
	}
	
}
