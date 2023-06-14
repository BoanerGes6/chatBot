package com.boaner.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.boaner.demo")
public class ChatWithRimApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatWithRimApplication.class, args);
	}

}
