package com.tobyplunkett.springcore.demo.firstcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//explicitly define packages to scan for components (default only scan package holding springbootapplication)
//@SpringBootApplication(
//		scanBasePackages = {"com.tobyplunkett.util",
//							"com.tobyplunkett.springcore.demo.firstcore"}
//)

@SpringBootApplication
public class FirstcoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstcoreApplication.class, args);
	}
}
