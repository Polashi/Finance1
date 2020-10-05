package com.oracle.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String urlString = "jdbc:oracle:thin:@localhost:1539:orcl";
			String usernameString = "project";
			String passwordString = "hr";
			connection = DriverManager.getConnection(urlString, usernameString, passwordString);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
