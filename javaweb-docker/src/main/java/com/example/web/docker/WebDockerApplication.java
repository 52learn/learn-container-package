package com.example.web.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebDockerApplication.class, args);
	}
	@RequestMapping("/")
	public String home() {
		return "Together with me, our life will be more wonderful and happier! ";
	}
}
