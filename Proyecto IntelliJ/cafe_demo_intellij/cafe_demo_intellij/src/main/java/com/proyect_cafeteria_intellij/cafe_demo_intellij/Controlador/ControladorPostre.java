package com.proyect_cafeteria_intellij.cafe_demo_intellij.Controlador;

import com.proyect_cafeteria_intellij.cafe_demo_intellij.Entidades.Postre;
import com.proyect_cafeteria_intellij.cafe_demo_intellij.Sevicios.GestionPostres;

import java.util.ArrayList;
import java.util.Scanner;

public class ControladorPostre {

    GestionPostres GPostres = new GestionPostres();
    ArrayList<Postre> postresAux = GPostres.crearPostres();
    Scanner ingresoD = new Scanner(System.in);

    public void actualizarPostre(){

        int opcion = 0;
        GPostres.mostrarPostres();
        int indice = GPostres.buscarPostre();

        while (opcion != 5){

            System.out.println(postresAux.get(indice).toString());

            if (indice < postresAux.size()){

                System.out.println("\n --- 2. ACTUALIZAR POSTRE --- " +
                        "\n1. Actualizar Nombre\n2. Actualizar Tipo\n3. Actualizar Descripción\n4. Actualizar Precio\n5. Volver");
                opcion = ingresoD.nextInt();

                switch (opcion){

                    case 1:
                        GPostres.actualizarNombreP(indice);
                        break;

                    case 2:
                        GPostres.ActualizarTipoP(indice);
                        break;

                    case 3:
                        GPostres.ActualizarDescripcionP(indice);
                        break;

                    case 4:
                        GPostres.actualizarPrecioP(indice);
                        break;

                    case 5:
                        System.out.println("\nVolviendo ...");
                        break;

                }

            } else {

                System.out.println("Intenta de nuevo con un codigo existente.");

            }

        }

    }

}
