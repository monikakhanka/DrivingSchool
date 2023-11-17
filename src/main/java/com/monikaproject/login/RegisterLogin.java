package com.monikaproject.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class RegisterLogin {

	@RequestMapping("/")
	String home(){
		return "Hello world";
	}
	public static void main(String[] args) {
		SpringApplication.run(RegisterLogin.class, args);
	}

}
