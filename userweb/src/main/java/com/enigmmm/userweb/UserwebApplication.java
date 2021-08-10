package com.enigmmm.userweb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserwebApplication {
	static final Logger logger = LoggerFactory.getLogger(UserwebApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(UserwebApplication.class, args);
	}

}
