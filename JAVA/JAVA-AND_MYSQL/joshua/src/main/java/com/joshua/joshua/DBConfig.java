package com.joshua.joshua;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class DBConfig {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		variables
		int id = 8;
		String name = "Victor";
		double score = 79.4;
		String query = "insert into users values(?,?,?)";
		
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
		PreparedStatement statement = connection.prepareStatement(query);  // preparedStament for multiple adding of data
		
//		we need to update the value by replacing the ??? with the values
		
		statement.setInt(1, id);
		statement.setString(2, name);
		statement.setDouble(3, score);
		
		
		int count =  statement.executeUpdate();
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
