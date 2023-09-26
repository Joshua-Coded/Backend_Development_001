package com.joshua.joshua;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class DBConfig {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		variables
		String query = "insert into users values(5, 'Kibo', 70)";
		
		// load the driver
		// oracle.jdbc.Driver.OracleDriver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Create the connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students", "invictus", "invictus"); 
		
		// connection checks
		if(connection != null) {
			System.out.println("connection established");
		}
		
		// create statement
		Statement statement = connection.createStatement();
		int count =  statement.executeUpdate(query);
//		the part is for updating the database
		System.out.println(count + "row/s affected");
		
		
		
		
		
		
		
		
		
		
		
//		boolean isFound = false;
		 
//		String userData = "";
//		while(resultSet.next()) 
		{
//			isFound = true;
//		 userData = resultSet.getInt(1) + " " + resultSet.getString(2);
//			System.out.println(userData);
		}
		
//		if(!isFound) {
//			System.out.println("no record found!");
//		}
		
		// close the connection
		
//		resultSet.close();
		statement.close();
		connection.close();
	}

}
