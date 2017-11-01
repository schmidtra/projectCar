package com.revature.beans;

public class Employee
{
	private int id;
	private String firstName;
	private String lastName;
	private String midInitial;
	private String username;
	private String password;
	private int department;
	private String position;
	private int reportsTo;
	private String street;
	private String city;
	private String state;
	private int zip;
	private String country;
	
	public Employee(int id, String username, String password, String firstName,
			String lastName, String midInitial, String position, int department,
			int reportsTo, String street, String city, String state, int zip, String country)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.midInitial = midInitial;
		this.username = username;
		this.password = password;
		this.department = department;
		this.position = position;
		this.reportsTo = reportsTo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}
	
	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public String getMidInitial() 
	{
		return midInitial;
	}

	public void setMidInitial(String midInitial) 
	{
		this.midInitial = midInitial;
	}

	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username) 
	{
		this.username = username;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public int getDepartment()
	{
		return this.department;
	}
	
	public void setDepartment(int department)
	{
		this.department = department;
	}
		
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getReportsTo()
	{
		return this.reportsTo;
	}
	
	public void setReportsTo(int e)
	{
		this.reportsTo = e;
	}

	public String getStreet() 
	{
		return street;
	}
	
	public void setStreet(String street) 
	{
		this.street = street;
	}

	public String getCity() 
	{
		return city;
	}

	public void setCity(String city) 
	{
		this.city = city;
	}

	public String getState() 
	{
		return state;
	}

	public void setState(String state) 
	{
		this.state = state;
	}

	public int getZip() 
	{
		return zip;
	}

	public void setZip(int zip) 
	{
		this.zip = zip;
	}

	public String getCountry() 
	{
		return country;
	}

	public void setCountry(String country) 
	{
		this.country = country;
	}

	void requestReimbursement()
	{
		
	}
}
