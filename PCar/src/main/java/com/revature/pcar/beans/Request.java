package com.revature.pcar.beans;
public class Request 

{

	private int id;

	private int empId;

	private String type;

	private double cost;

	private String description;
	
	private String eventStart;

	private String appDate;

	private double amount;

	private String reason;

	private String duration;

	private String grade;

	private int status;

	private String eventEnd;

	private int signer;

	private String lName;
	
	private String lStreet;
	
	private String lCity;
	
	private String lState;
	
	private String lZip;
	public Request(int id, int empId, String type, double cost, String eventStart,

			String appDate, double amount, String description, String reason, String duration, 

			 int status, String eventEnd, int signer, String lName, String lStreet, String lCity,
			 String lState, String lZip)

	{
		this.lName = lName;
		
		this.lCity = lCity;
		
		this.lStreet = lStreet;
		
		this.lState = lState;
		
		this.lZip = lZip;
		
		this.id = id;
		
		this.type = type;

		this.cost = cost;
		
		this.description = description;
		
		this.eventStart = eventStart;

		this.appDate = appDate;

		this.amount = amount;

		this.reason = reason;

		this.duration = duration;

		this.status = status;

		this.eventEnd = eventEnd;

		this.signer = signer;

	}

	

	public String getlName() {
		return lName;
	}



	public void setlName(String lName) {
		this.lName = lName;
	}



	public String getlStreet() {
		return lStreet;
	}



	public void setlStreet(String lStreet) {
		this.lStreet = lStreet;
	}



	public String getlCity() {
		return lCity;
	}



	public void setlCity(String lCity) {
		this.lCity = lCity;
	}



	public String getlState() {
		return lState;
	}



	public void setlState(String lState) {
		this.lState = lState;
	}



	public String getlZip() {
		return lZip;
	}



	public void setlZip(String lZip) {
		this.lZip = lZip;
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



	public int getStatus() 

	{

		return status;

	}



	public void setStatus(int status) 

	{

		this.status = status;

	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}

}
