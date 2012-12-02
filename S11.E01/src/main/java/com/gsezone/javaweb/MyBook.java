package com.gsezone.javaweb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyBook {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost/test";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(url, "root", "");
		
		Statement statement = connection.createStatement();

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("CREATE TABLE book (");
		stringBuilder.append("  id INTEGER(11) NOT NULL,");
		stringBuilder.append("  title VARCHAR(100) NOT NULL,");
		stringBuilder.append("  price FLOAT(9,3) NOT NULL,");
		stringBuilder.append("  isbn INTEGER(11) NOT NULL");
		stringBuilder.append(")");
		
		String statementString = stringBuilder.toString();
		
		statement.execute(statementString);
		
		statement.close();
		connection.close();
		
		 
	}
}
