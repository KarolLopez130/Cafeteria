package com.proyect_cafeteria_intellij.cafe_demo_intellij;

import com.proyect_cafeteria_intellij.cafe_demo_intellij.Controlador.ControladorCaja;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Scanner;

@SpringBootApplication
@ComponentScan
public class CafeDemoIntellijApplication{

	public static void main(String[] args) {
		SpringApplication.run(CafeDemoIntellijApplication.class, args);
	}

}
