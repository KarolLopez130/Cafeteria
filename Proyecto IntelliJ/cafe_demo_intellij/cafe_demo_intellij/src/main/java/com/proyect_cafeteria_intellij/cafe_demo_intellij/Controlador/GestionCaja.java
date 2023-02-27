package com.proyect_cafeteria_intellij.cafe_demo_intellij.Controlador;

import com.proyect_cafeteria_intellij.cafe_demo_intellij.Modelo.Cafe;
import com.proyect_cafeteria_intellij.cafe_demo_intellij.Modelo.Postre;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionCaja {

    ArrayList<Cafe> cafesCitos = new ArrayList<>();
    ArrayList<Postre> postresAux = new ArrayList<>();
    Scanner ingresoD = new Scanner(System.in);

    public void CrearCafes() {
        Cafe cafecito1 = new Cafe("abc111", "Mocha Blanco Latte", "Mochas", "Espresso 100% colombiano con leche vaporizada, salsa de mocha blanco", 8000);
        Cafe cafecito2 = new Cafe("abc112", "Latte", "Latte", "Espresso colombiano con leche vaporizada, ligeramente cubierto con espuma.", 9000);
        Cafe cafecito3 = new Cafe("abc113", "Dolce Canela Latte", "Latte", "Espresso colombiano con leche vaporizada, jarabe de canela dulce.", 6000);
        Cafe cafecito4 = new Cafe("abc114", "Arequipe Latte", "Latte", "Espresso 100% colombiano con leche vaporizada a la perfección, combinado con salsa de arequipe, terminado con espiral de caramelo.", 7000);

        cafesCitos.add(cafecito1);
        cafesCitos.add(cafecito2);
        cafesCitos.add(cafecito3);
        cafesCitos.add(cafecito4);


    }

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

    // GESTIONAR CAFES




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

    //Buscar
    //String CafecitoaBuscar = JOptionPane.showInputDialog("Ingrese el codigo: ");
    //if (cafesCitos.contains(CafecitoaBuscar)){
    //JOptionPane.showMessageDialog(null, "valor encontrado! ");
    //}else {
    //JOptionPane.showMessageDialog(null, "No se encontro el valor");
    //}

}

