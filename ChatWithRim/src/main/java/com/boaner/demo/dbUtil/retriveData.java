package com.boaner.demo.dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class retriveData {

private static Connection connection = null;
	
	public static Connection getConnection() throws SQLException {
		
		if (connection != null) {
			
			return connection;
		}else {
			
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/chatdatastorage?useSSL=false";
			String user = "root";
			String psw = "boaner@1102";
			
			try {
				Class.forName(driver);
				connection = DriverManager.getConnection(url,user,psw);
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}
		}
		return connection;
	}
	
}
