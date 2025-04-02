package com.example.springboot.docker.goodmorning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GoodmorningApplication {

	@GetMapping("/hello/{message}")
	public String message(@PathVariable("message") String name) {
		System.out.println("Good morning....message()");
		return "<h3>Hello Mr/Mrs.<h1>"+name+"</h1>.....Good morning!</h3>" ;
	}

	public static void main(String[] args) {
		SpringApplication.run(GoodmorningApplication.class, args);
	}

}
