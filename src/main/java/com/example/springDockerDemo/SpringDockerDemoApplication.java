package com.example.springDockerDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringDockerDemoApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Hello VASU..! How are you";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerDemoApplication.class, args);
	}

}
