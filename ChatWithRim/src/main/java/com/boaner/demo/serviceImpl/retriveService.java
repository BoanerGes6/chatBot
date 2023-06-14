package com.boaner.demo.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.boaner.demo.dbUtil.retriveData;

public class retriveService {

	Connection connection;

	// calling constructor
	public retriveService() throws SQLException {
		connection = retriveData.getConnection();
	}
	
	public ResultSet addChat() {
//		String userChat = "";
//		String systemChat = "";
//		String fetchQuery = "select * from chattabel where userChat=? and systemChat=?";
		String fetchQuery = "select * from chattabel";

		ResultSet rs=null;
		try {
			PreparedStatement stmt = connection.prepareStatement(fetchQuery);
//			stmt.setString(1, userChat);
//	        stmt.setString(2, systemChat);
			rs = stmt.executeQuery();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
}
