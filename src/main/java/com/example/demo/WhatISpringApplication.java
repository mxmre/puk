package com.example.demo;

import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WhatISpringApplication {

	public static void main(String[] args) throws IOException {
            ApiGlobals.BaseInit();
            SpringApplication.run(WhatISpringApplication.class, args);
	}

}
