package com.sp.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sp.tech.service.CustomerService;

@SpringBootApplication
public class OneToOneDemoApplication implements CommandLineRunner {

	@Autowired
	CustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		customerService.saveCustomer();

	}

}
