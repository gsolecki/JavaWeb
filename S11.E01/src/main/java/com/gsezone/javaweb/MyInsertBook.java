package com.gsezone.javaweb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyInsertBook {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost/test";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(url, "root", "");
		
		Statement statement = connection.createStatement();
		
		Book book = new Book(1, "My Java OCPJP", 10.5f, 12345);
		
		String statementString = "INSERT INTO book VALUE (" +
				+ book.getId() + ", " + book.getTitle() +
						",22.5,54321);";
		
		statement.execute(statementString);
		
		statement.close();
		connection.close();
	}

}
