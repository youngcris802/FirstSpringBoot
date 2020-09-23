package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloSpringBoot {
	@RequestMapping("/")
	public String home(){
		return "Hello Spring boot World";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBoot.class, args);
		}

}
