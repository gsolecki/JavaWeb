package com.gsezone.javaweb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MySelectBook {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost/test";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(url, "root", "");
		
		Statement statement = connection.createStatement();
		
		String statementString = "SELECT * FROM book";
		
		ResultSet resultSet = statement.executeQuery(statementString);
		
		List<Book> books = new ArrayList<Book>();

		while (resultSet.next()) {
			int int1 = resultSet.getInt("id");
			String string = resultSet.getString("title"); 
			float float1 = resultSet.getFloat("price");
			int int2 = resultSet.getInt("isbn");
			
			books.add(new Book(int1, string, float1, int2));
			System.out.println(" " + int1 + " " + string + " " + float1 + " " + int2 + ";");
		}
		
		statement.close();
		connection.close();
	}

}
