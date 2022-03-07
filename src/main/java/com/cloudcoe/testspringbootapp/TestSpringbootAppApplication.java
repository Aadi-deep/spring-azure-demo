package com.cloudcoe.testspringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestSpringbootAppApplication {

	@GetMapping("/message")
	public String message()
	{
		return "Congrats! Your application deployed successfully on Azure Platform. ";
	}

	public static void main(String[] args) {
		SpringApplication.run(TestSpringbootAppApplication.class, args);
	}

}
