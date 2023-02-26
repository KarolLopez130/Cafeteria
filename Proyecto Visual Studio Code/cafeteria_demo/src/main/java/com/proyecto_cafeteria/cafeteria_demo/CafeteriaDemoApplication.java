package com.proyecto_cafeteria.cafeteria_demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CafeteriaDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CafeteriaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("\nHola Mundo");
		System.out.println("\nHola Mundo");
	}

}
