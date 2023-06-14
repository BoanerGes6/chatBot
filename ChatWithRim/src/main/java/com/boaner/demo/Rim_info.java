package com.boaner.demo;

import java.util.Random;

public class Rim_info {
	
	private static Random r = new Random(); 
	
	public static String main (String conv) {
		
		int selectNameConv = r.nextInt(4-1)+1;
		int identifyMe = r.nextInt(3-1)+1;
		String chat = "";
		
		if (conv.toLowerCase().contains("your name") || conv.toLowerCase().contains("ur name") 
				|| conv.toLowerCase().contains("who r you") || conv.toLowerCase().contains("who r u")
				|| conv.toLowerCase().contains("who are you") || conv.toLowerCase().contains("who are u")) {
			
			if (selectNameConv ==1 ) {
				chat = "I am Rim";
			}else if (selectNameConv == 2) {
				chat = "My name is Rim";
			}else if (selectNameConv == 3) {
				chat = "I am Rim... nice to meet you";
			}
		}else if (conv.contains("what are") || conv.contains("what r")) {
			
			if (identifyMe == 1) {
				chat = "I Am an AI";
			}else if (identifyMe == 2) {
				chat = "I Am Rim an AI";
			}
		}else if (conv.contains("developed") || conv.contains("created")) {
			chat = "Sorry...its Confidential";
		}
		
		return chat;
	}

}
