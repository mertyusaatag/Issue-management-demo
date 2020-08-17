package com.merty.Dosdemo1;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Dosdemo1Application {
	public static void main(String[] args) {
		SpringApplication.run(Dosdemo1Application.class, args);
	}
	@Bean
	public ModelMapper getModelMapper()
	{
		return new ModelMapper();
	}


}
