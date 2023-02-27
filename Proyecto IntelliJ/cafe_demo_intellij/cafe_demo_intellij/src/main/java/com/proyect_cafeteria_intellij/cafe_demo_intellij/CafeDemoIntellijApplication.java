package com.proyect_cafeteria_intellij.cafe_demo_intellij;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CafeDemoIntellijApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CafeDemoIntellijApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Aqui va todo lo del Main normal

		Scanner ingresoD = new Scanner(System.in);

		System.out.println("-------- SDK Cafete" +
				"ría --------" + "\n\n<--- CAFETERIA ABIERTA --->");

		int opcion = 0;

		while (opcion != 4){

			System.out.println("\n --- GESTIÓN --- " +
			"\n1. Menú\n2. Nuevo Pedido\n3. Gestionar Otros\n4. Cerrar Cafetería");
			opcion = ingresoD.nextInt();

			switch (opcion){

				case 1:

					break;

				case 2:
					break;

				case 3:
					break;

				case 4:
					System.out.println("\n --- INFORME GENERAL FINAL --- ");
					break;

				default:
					System.out.println("\nOpción no Valida, intente de nuevo.");
					break;

			}



		}



	}
}
