package com.hcl.spring.jenkins;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
		System.out.println("Hello....DevOps.....");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello....DevOps.....");
		
	}

}
