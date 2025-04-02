package com.example.springboot.docker.goodmorning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GoodmorningApplication {

	@GetMapping("/message")
	public String message() {
		System.out.println("Good morning....message()");
		return "<h1>Hello World .....!</h1>" ;
	}

	public static void main(String[] args) {
		System.out.println("Good morning....main()");
		SpringApplication.run(GoodmorningApplication.class, args);
	}

}
