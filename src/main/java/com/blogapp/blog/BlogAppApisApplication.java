package com.blogapp.blog;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BlogAppApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogAppApisApplication.class, args);
	}
	
	//this class used to make model mapping easy. we can call its object where we want to map source to destination.
	@Bean
	public ModelMapper modelMapper() {
		
		return new ModelMapper();
	}

}
