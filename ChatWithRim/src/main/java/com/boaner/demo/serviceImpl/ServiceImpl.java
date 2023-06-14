package com.boaner.demo.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.boaner.demo.dao.saveDao;
import com.boaner.demo.dbUtil.saveData;

@Service
public class ServiceImpl implements saveDao{
	
	Connection connection;

	// calling constructor
	public ServiceImpl() throws SQLException {
		connection = saveData.getConnection();
	}
	
	@Override
	public void addChat(Object[] chatCollection) {
		String userMsg = (String) chatCollection[0];
		String rimmsg = (String) chatCollection[1];
		
		String insertQuery = "INSERT INTO chattabel VALUES (?, ?)";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(insertQuery);
			stmt.setString(1, userMsg);
	        stmt.setString(2, rimmsg);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
