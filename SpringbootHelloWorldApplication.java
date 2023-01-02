package com.gl.SpringbootHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication

public class SpringbootHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloWorldApplication.class, args);
		System.out.println("this is my first practice Spring App");
	}

}
