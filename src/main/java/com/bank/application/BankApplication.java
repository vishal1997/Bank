package com.bank.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextListener;


@SpringBootApplication
@Configuration
public class BankApplication {

	@Bean
	public RequestContextListener requestContextListener() {
	    return new RequestContextListener();
	}
	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}
}
