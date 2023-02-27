package com.proyect_cafeteria_intellij.cafe_demo_intellij.Controlador;

import com.proyect_cafeteria_intellij.cafe_demo_intellij.Modelo.Postre;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionMain {

    ArrayList<Postre> postresAux = new ArrayList<>();
    Scanner ingresoD = new Scanner(System.in);



    public void crearPostres(){

        Postre postre1 = new Postre("pst111", "Rollo de Canela", "Rollo", "Exquisito rollo francés relleno de canela.", 6000);
        Postre postre2 = new Postre("pst112", "Muffin de Chocolate", "Muffin", "Muffin de chocolate, horneado con trozos de chocolate.", 5500);
        Postre postre3 = new Postre("pst113", "Muffin Arándanos", "Muffin", "Muffin de arandanos y vainilla.", 5500);
        Postre postre4 = new Postre("pst114", "Arepa con Queso", "Arepa", "Arepa de maíz con queso y margarina.", 5000);

        postresAux.add(postre1);
        postresAux.add(postre2);
        postresAux.add(postre3);
        postresAux.add(postre4);

    }

    // GESTION POSTRES
    public void mostrarPostres(){

        System.out.println("\n --- POSTRES --- ");
        postresAux.forEach((n) -> System.out.println("\n" + n.toString()));

    }

    public int buscarPostre(){

        System.out.println("\nIngresa el Codigo del Postre que buscas:");
        String codigo = ingresoD.next();
        codigo = ingresoD.next();
        int indice = 0;

        for (int i = 0; i < postresAux.size(); i++){

            if (postresAux.get(i).getCodigo().equals(codigo)){

                System.out.println("\nPostre Encontrado.");
                System.out.println(postresAux.get(i).toString());
                indice = i;

            } else {
                System.out.println("\nEl Postre no se encuentra en la base de datos.");

            }

        }

        return indice;

    }


    public boolean actualizarNombreP(int indice){

        boolean respuesta = false;

        System.out.println("\nIngresa el nuevo nombre del producto");
        String newName = ingresoD.nextLine();
        newName = ingresoD.nextLine();

        System.out.println("\n¿Desea realizar el cambio?\n1. Si\n2. No");
        int opcion = ingresoD.nextInt();

        if (opcion == 1){

            postresAux.get(indice).setNombre(newName);
            respuesta = true;

        } else {

            System.out.println("\nNo se realizo la actualización.");

        }

        return respuesta;

    }


    public boolean ActualizarTipoP(){
        boolean respuesta = false;

        return respuesta;
    }



    public void actualizarPostre(){

        int opcion = 0;
        mostrarPostres();
        int indice = buscarPostre();

        while (opcion != 5){

            System.out.println(postresAux.get(indice).toString());

            if (indice != 0){

                System.out.println("\n --- 2. ACTUALIZAR POSTRE --- " +
                        "\n1. Actualizar Nombre\n2. Actualizar Tipo\n3. Actualizar Descripción\n4. Actualizar Precio\n5. Volver");
                opcion = ingresoD.nextInt();

                switch (opcion){

                    case 1:
                        actualizarNombreP(indice);
                        break;

                    case 2:
                        break;

                    case 3:
                        break;

                    case 4:
                        break;

                }

            } else {

                System.out.println("Intenta de nuevo con un codigo existente.");

            }

        }

    }


    public void gestionarOtros(){

        int opcion = 0;
        while (opcion != 4){

            System.out.println("\n --- GESTIÓN --- " +
                    "\n1. Gestion Productos\n2. Ver Pedidos Actuales\n3. \n4. Cerrar Cafetería");

            opcion = ingresoD.nextInt();

            switch (opcion){

                case 1:

                    while (opcion !=  5){

                        System.out.println("\n --- 1. GESTIÓN PRODUCTOS --- " +
                                "\n1. Actualizar Cafe\n2. Actualizar Postre\n3. Añadir Cafe\n4. Añadir Postre\n5. Volver");
                        opcion = ingresoD.nextInt();

                    }


                    break;

                case 2:
                    break;

                case 3:
                    break;

            }

        }

    }

}