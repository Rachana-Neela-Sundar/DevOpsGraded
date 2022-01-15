package com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

	public static void main(String[] args) {
		
		SpringApplication.run(App.class, args);
		System.err.println("Hello Dev-Ops");
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello Dev_Ops");
		
	}

}
