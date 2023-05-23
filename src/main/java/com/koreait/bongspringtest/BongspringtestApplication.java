package com.koreait.bongspringtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@SpringBootApplication
public class BongspringtestApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(BongspringtestApplication.class, args);
	}

}
