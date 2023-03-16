package com.cafeteria.cafeteriaDemo.Controlador;

import com.cafeteria.cafeteriaDemo.Entidades.Cafe;
import com.cafeteria.cafeteriaDemo.Servicios.ServicioCafe;

import java.util.ArrayList;
import java.util.Scanner;

public class ControladorCafe {

    Scanner ingresoD = new Scanner(System.in);

    ServicioCafe GCafes = new ServicioCafe();
    ArrayList<Cafe> cafescitos = GCafes.CrearCafes();

    public ArrayList<Cafe> getCafescitos() {
        return cafescitos;
    }

    public void actualizarCafe () {



        int opcion = 0;
        GCafes.mostrarCafes(cafescitos);
        int indice = GCafes.buscarCafe(cafescitos);

        while (opcion != 5) {

            System.out.println(cafescitos.get(indice).toString());

            if (indice > cafescitos.size()) {

                System.out.println("\n --- 2. ACTUALIZAR CAFESCITOS --- " +
                        "\n1. Actualizar Nombre\n2. Actualizar Tipo\n3. Actualizar Descripción\n4. Actualizar Precio\n5. Volver");
                opcion = ingresoD.nextInt();

                switch (opcion) {

                    case 1:
                        GCafes.actualizarNombreC(indice, cafescitos);
                        break;

                    case 2:
                        GCafes.actualizarTipoC(indice, cafescitos);
                        break;

                    case 3:
                        GCafes.actualizarDescripcionC(indice, cafescitos);
                        break;

                    case 4:
                        GCafes.actualizarPrecioC(indice, cafescitos);
                        break;

                }

            } else {

                System.out.println("Intenta de nuevo con un codigo existente.");

            }

        }

    }

}
