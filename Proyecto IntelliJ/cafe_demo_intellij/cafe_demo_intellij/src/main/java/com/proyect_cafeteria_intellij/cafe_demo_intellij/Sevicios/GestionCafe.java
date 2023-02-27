package com.proyect_cafeteria_intellij.cafe_demo_intellij.Sevicios;

import com.proyect_cafeteria_intellij.cafe_demo_intellij.Entidades.Cafe;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionCafe {

    ArrayList<Cafe> cafesCitos = new ArrayList<>();

    Scanner ingresoD = new Scanner(System.in);

    public ArrayList<Cafe> CrearCafes() {
        Cafe cafecito1 = new Cafe("abc111", "Mocha Blanco Latte", "Mochas", "Espresso 100% colombiano con leche vaporizada, salsa de mocha blanco", 8000);
        Cafe cafecito2 = new Cafe("abc112", "Latte", "Latte", "Espresso colombiano con leche vaporizada, ligeramente cubierto con espuma.", 9000);
        Cafe cafecito3 = new Cafe("abc113", "Dolce Canela Latte", "Latte", "Espresso colombiano con leche vaporizada, jarabe de canela dulce.", 6000);
        Cafe cafecito4 = new Cafe("abc114", "Arequipe Latte", "Latte", "Espresso 100% colombiano con leche vaporizada a la perfección, combinado con salsa de arequipe, terminado con espiral de caramelo.", 7000);

        cafesCitos.add(cafecito1);
        cafesCitos.add(cafecito2);
        cafesCitos.add(cafecito3);
        cafesCitos.add(cafecito4);

        return cafesCitos;
    }

    // GESTIONAR CAFES

    //metodo mostrar
    public void mostrarCafes(){

        System.out.println("\n --- CAFES --- ");
        cafesCitos.forEach((n) -> System.out.println("\n" + n.toString()));
    }

    //metodo agregar cafescito
    public void agregarCafescito(){

        int indice = buscarCafe();


        System.out.println("Agregar codigo del cafescito:");
        // Obtenemos la patente que el usuario escribió y la guardamos en el vehiculo.
        String nuevoCod= ingresoD.next();


        if (!nuevoCod.equals(indice)) {

            Cafe a = new Cafe();
            a.setCodigo(nuevoCod);

            System.out.println("Ingrese el nombre del cafescito: ");
            a.setNombre(ingresoD.nextLine());

            System.out.println("Ingrese el tipo de cafescito: ");
            a.setTipo(ingresoD.nextLine());

            System.out.println("Ingrese la descripcion de cafescito:");
            a.setDescripcion(ingresoD.nextLine());

            System.out.println("Ingrese el precio del cafescito:");
            a.setPrecio(ingresoD.nextInt());



            // Este paso es fundamental, tomamos el cafescito (En este caso definido con la variable a),
            // Y lo guardamos en la lista de cafesCitos utilizando el método de la lista .add(a);
            cafesCitos.add(a);

            // Le avisamos al usuario del vehiculo creado

            System.out.println("CAFESCITO CREADO: ");
            System.out.println("Codigo " + a.getTipo());
            System.out.println("Nombre " + a.getNombre());
            System.out.println("Tipo " + a.getTipo());
            System.out.println("Precio " + a.getPrecio());



        } else {
            System.out.println("El cafescito existe en la base de datos");
        }

        //Agregar nuevo cafescito
        // Instanciamos un vehiculo vacio (Sin atributos)



    }

    //metodo eliminar
    // ELiminar cafescito de la lista

    public void eliminarCafescito (){
        System.out.println("Ingreser el codigo del cafescito a eliminar: ");
        String codigo = ingresoD.nextLine();

        for (int i = 0; i < cafesCitos.size(); i++) {
            Cafe cafe = cafesCitos.get(i);
            // buscamos cual de las patentes en la lista coincide con lo que el usuario escribió:
            if (codigo.equals(cafe.getCodigo())) {
                // Eliminamos un elemento de la lista utilizando .remove()
                cafesCitos.remove(i);
                System.out.println("Cafescito eliminado");
            }
        }
    }





    //metodo buscar
    public int buscarCafe () {

        System.out.println("\nIngresa el Codigo del Cafe que buscas: ");
        String codigo = ingresoD.next();
        codigo = ingresoD.next();
        int indice = 0;

        for (int i = 0; i < cafesCitos.size(); i++) {

            if (cafesCitos.get(i).getCodigo().equals(codigo)) {

                System.out.println("\nCafescito Encontrado.");
                System.out.println(cafesCitos.get(i).toString());
                indice = i;

            } else {
                indice = cafesCitos.size();
                System.out.println("\nEl Cafescito no se encuentra en la base de datos.");

            }

        }

        return indice;

    }

    public String buscarCafeXCod () {

        System.out.println("\nIngresa el Codigo del Cafe que buscas: ");
        String codigo = ingresoD.next();
        codigo = ingresoD.next();
        int indice = 0;

        for (int i = 0; i < cafesCitos.size(); i++) {

            if (cafesCitos.get(i).getCodigo().equals(codigo)) {

                System.out.println("\nCafescito Encontrado.");
                System.out.println(cafesCitos.get(i).toString());


            } else {
                codigo = "0";
                System.out.println("\nEl Cafescito no se encuentra en la base de datos.");

            }

        }

        return codigo;

    }

    //metodo actualizar nombre
    public void actualizarNombreC ( int indice){


        System.out.println("\nIngresa el nuevo nombre del Cafescito");
        String newName = ingresoD.nextLine();
        newName = ingresoD.nextLine();

        System.out.println("\n¿Desea realizar el cambio?\n1. Si\n2. No");
        int opcion = ingresoD.nextInt();

        if (opcion == 1) {

            cafesCitos.get(indice).setNombre(newName);


        } else {

            System.out.println("\nNo se realizo la actualización.");

        }


    }


    public void actualizarTipoC ( int indice){


        System.out.println("\nIngresa el nuevo Tipo del Cafescito");
        String newTipo = ingresoD.nextLine();
        newTipo = ingresoD.nextLine();

        System.out.println("\n¿Desea realizar el cambio?\n1. Si\n2. No");
        int opcion = ingresoD.nextInt();

        if (opcion == 1) {

            cafesCitos.get(indice).setTipo(newTipo);


        } else {

            System.out.println("\nNo se realizo la actualización.");

        }

    }

    //metodo actualizar Descripcion
    public void actualizarDescripcionC ( int indice){


        System.out.println("\nIngresa la nueva Descripcion del Cafescito");
        String newDescripcion = ingresoD.nextLine();
        newDescripcion = ingresoD.nextLine();

        System.out.println("\n¿Desea realizar el cambio?\n1. Si\n2. No");
        int opcion = ingresoD.nextInt();

        if (opcion == 1) {

            cafesCitos.get(indice).setDescripcion(newDescripcion);


        } else {

            System.out.println("\nNo se realizo la actualización.");

        }

    }

    //metodo actualizar Precio
    public void actualizarPrecioC ( int indice){


        System.out.println("\nIngresa el nuevo precio del Cafescito");
        int newPrecio = ingresoD.nextInt();
        newPrecio = ingresoD.nextInt();

        System.out.println("\n¿Desea realizar el cambio?\n1. Si\n2. No");
        int opcion = ingresoD.nextInt();

        if (opcion == 1) {

            cafesCitos.get(indice).setPrecio(newPrecio);


        } else {

            System.out.println("\nNo se realizo la actualización.");

        }

    }

}
