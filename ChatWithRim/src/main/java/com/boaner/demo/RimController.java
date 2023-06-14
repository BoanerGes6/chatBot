package com.boaner.demo;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boaner.demo.dao.saveDao;
import com.boaner.demo.serviceImpl.retriveService;


@Controller
public class RimController {
		
	@RequestMapping(value ="rimhome", method = RequestMethod.GET)
	public String homePage() {
		return "rimhome";
	}
	
	@RequestMapping(value ="rimhome", method = RequestMethod.POST)
	public String ChatPage() {
		return "rimchat";
	}
	
	@Autowired
	private saveDao data;
	
	@PostMapping(value ="/chatterbox")
	@ResponseBody
	public String convPage(ModelMap model, @RequestParam String conv) throws SQLException {
		String result = conv;
		model.addAttribute("result", result);
		if(conv.toLowerCase().contains("wikipedia")) {
			
			try {
	            result = wikisearch.main(conv);
	        } catch (IOException e) {
	            e.printStackTrace();
	            result = "An error occurred: " + e.getMessage();
	        }
			System.out.println("Tested");
			
		} else if(conv.toLowerCase().contains("your") || conv.toLowerCase().contains("ur")
				|| conv.toLowerCase().contains("who r you") || conv.toLowerCase().contains("who r u")
				|| conv.toLowerCase().contains("who are you") || conv.toLowerCase().contains("who are u")
				|| conv.toLowerCase().contains("who developed you") || conv.toLowerCase().contains("who developed u")
				|| conv.toLowerCase().contains("who created you") || conv.toLowerCase().contains("who created u") ||
				conv.toLowerCase().contains("what are you") || conv.toLowerCase().contains("what r u")) {
			result = Rim_info.main(conv);
			
		}else {
			result = "Oops...! Can't Understand";
		}

		Object[] chatCollection = {conv , result};
		
		data.addChat(chatCollection); // saving chats to database
		
		// fetching data from database
		retriveService service = new retriveService();
	    ResultSet rs= service.addChat();
	    String column2Value="";
	    try {
	        while (rs.next()) {
	            String column1Value = rs.getString(1);
	            column2Value = rs.getString(2);
	            
	            // Process the retrieved data
	            
	        }
	        System.out.println(column2Value);
	    } catch (SQLException e) {
	        e.printStackTrace();
	}
		return result;
	}
	

	
}
