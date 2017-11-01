package com.revature.beans;

public class Request 
{
	private int id;
	private int empId;
	private String type;
	private double cost;
	private String eventStart;
	private String appDate;
	private double amount;
	private String reason;
	private String duration;
	private String grade;
	private String status;
	private String eventEnd;
	private int signer;
	
	public Request(int empId, String type, double cost, String eventStart,
			String appDate, double amount, String reason, String duration, 
			String grade, String status, String eventEnd, int signer)
	{
		this.type = type;
		this.cost = cost;
		this.eventStart = eventStart;
		this.appDate = appDate;
		this.amount = amount;
		this.reason = reason;
		this.duration = duration;
		this.grade = grade;
		this.status = status;
		this.eventEnd = eventEnd;
		this.signer = signer;
	}
	
	public int getEmpId() 
	{	
		return empId;
	}

	public void setEmpId(int empId) 
	{
		this.empId = empId;
	}

	public String getEventStart() 
	{
		return eventStart;
	}

	public void setEventStart(String eventStart) 
	{
		this.eventStart = eventStart;
	}

	public String getAppDate() 
	{
		return appDate;
	}

	public void setAppDate(String appDate) 
	{
		this.appDate = appDate;
	}

	public double getAmount() 
	{
		return amount;
	}

	public void setAmount(double amount) 
	{
		this.amount = amount;
	}

	public String getDuration() 
	{
		return duration;
	}

	public void setDuration(String duration) 
	{
		this.duration = duration;
	}

	public String getEventEnd() 
	{
		return eventEnd;
	}

	public void setEventEnd(String eventEnd) 
	{
		this.eventEnd = eventEnd;
	}

	public int getSigner() 
	{
		return signer;
	}

	public void setSigner(int signer) 
	{
		this.signer = signer;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getType() 
	{
		return type;
	}

	public void setType(String type) 
	{
		this.type = type;
	}

	public double getCost() 
	{
		return cost;
	}

	public void setCost(double cost) 
	{
		this.cost = cost;
	}

	public String getReason() 
	{
		return reason;
	}

	public void setReason(String reason) 
	{
		this.reason = reason;
	}

	public String getGrade() 
	{
		return grade;
	}

	public void setGrade(String grade) 
	{
		this.grade = grade;
	}

	public String getStatus() 
	{
		return status;
	}

	public void setStatus(String status) 
	{
		this.status = status;
	}
}
