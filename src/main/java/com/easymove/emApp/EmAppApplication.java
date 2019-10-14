package com.easymove.emApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories(basePackages= "com.easymove.emApp.repository")
@SpringBootApplication
public class EmAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmAppApplication.class, args);
	}

}

