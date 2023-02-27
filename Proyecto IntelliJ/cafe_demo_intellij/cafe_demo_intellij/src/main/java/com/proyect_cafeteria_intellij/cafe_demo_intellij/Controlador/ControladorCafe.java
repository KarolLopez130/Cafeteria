package com.proyect_cafeteria_intellij.cafe_demo_intellij.Controlador;

public class ControladorCafe {



    public void actualizarCafe () {

        int opcion = 0;
        mostrarCafes();
        int indice = buscarCafe();

        while (opcion != 5) {

            System.out.println(postresAux.get(indice).toString());

            if (indice > cafesCitos.size()) {

                System.out.println("\n --- 2. ACTUALIZAR CAFESCITOS --- " +
                        "\n1. Actualizar Nombre\n2. Actualizar Tipo\n3. Actualizar Descripción\n4. Actualizar Precio\n5. Volver");
                opcion = ingresoD.nextInt();

                switch (opcion) {

                    case 1:
                        actualizarNombreC(indice);
                        break;

                    case 2:
                        actualizarTipoC(indice);
                        break;

                    case 3:
                        actualizarDescripcionC(indice);
                        break;

                    case 4:
                        actualizarPrecioC(indice);
                        break;

                }

            } else {

                System.out.println("Intenta de nuevo con un codigo existente.");

            }

        }

    }

}
