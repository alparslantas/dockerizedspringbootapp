package com.sampleapp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerizedsampleappApplication {

	
	@RequestMapping("/")
    String home() {
        return "<h1>Hello Docker World!</h1>";
    }
	
	public static void main(String[] args) {
		SpringApplication.run(DockerizedsampleappApplication.class, args);
	}
}
