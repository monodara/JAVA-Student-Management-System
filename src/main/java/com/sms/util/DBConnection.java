package com.sms.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	//load the driver
	public static Connection getConn() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase","root","Loo199009!");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	//get the connection
	
	
	//creating statement - sql query
	
	
	//execute get Result 
	
	
	//close the connection
}
