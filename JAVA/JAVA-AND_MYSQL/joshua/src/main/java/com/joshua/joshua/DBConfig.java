package com.joshua.joshua;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// load the driver
		// oracle.jdbc.Driver.OracleDriver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Create the connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students", "invictus", "invictus"); 
		
		// connection checks
		if(connection != null) {
			System.out.println("connection established");
		}
		connection.close();
		
		
		
	}
}
