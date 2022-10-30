package com.simplilearn.sportyshoes1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.simplilearn.sportyshoes1")
public class SportyShoes1Application {

	public static void main(String[] args) {
		SpringApplication.run(SportyShoes1Application.class, args);
	}

}
