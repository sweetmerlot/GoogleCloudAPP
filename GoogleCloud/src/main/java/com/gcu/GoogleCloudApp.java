package com.gcu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class GoogleCloudApp {

	public static void main(String[] args) {
		SpringApplication.run(GoogleCloudApp.class, args);
	}

}
