package com.revature.pcar;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnFactory {

	private static ConnFactory cf = null;
	
	private ConnFactory(){
		super();
		
	}
	
	public static synchronized ConnFactory getInstance(){
		
		if(cf == null){
			
			cf = new ConnFactory();
			
		}
		
		return cf;
		
	}
	
	public Connection getConnection(){
		
		Connection conn = null;
		
		try {
			 


			conn = DriverManager.getConnection("jdbc:oracle:thin:@cyrilmanayath.cgjijxkmg9ju.us-east-1.rds.amazonaws.com:1521:ORCL","ProjectCARV2","racecar");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return conn;
		
	}
	
}
