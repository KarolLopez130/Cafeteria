package com.cafeteria.cafeteriaDemo.Servicios;

import com.cafeteria.cafeteriaDemo.Entidades.Cafe;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioCafe {

    Scanner ingresoD = new Scanner(System.in);

    public ArrayList<Cafe> CrearCafes() {

        ArrayList<Cafe> cafesCitos = new ArrayList<>();
        Cafe cafecito1 = new Cafe("abc111", "Mocha Blanco Latte", "Mochas", "Espresso 100% colombiano con leche vaporizada, salsa de mocha blanco", 8000, "https://djftrby1k8irl.cloudfront.net/s3fs-public/2022-03%2FMOCHA%20BLANCO-11.png?auto=format,compress&q=70&crop=focalpoint&ar=1:1.0&w=180&fit=crop");
        Cafe cafecito2 = new Cafe("abc112", "Latte", "Latte", "Espresso colombiano con leche vaporizada, ligeramente cubierto con espuma.", 9000, "https://djftrby1k8irl.cloudfront.net/s3fs-public/2022-03%2FLATTE-09.png?auto=format,compress&q=70&crop=focalpoint&ar=1:1.0&w=180&fit=crop");
        Cafe cafecito5 = new Cafe("abc115", "Mocha Latte", "Latte", "Espresso 100% colombiano con leche vaporizada a la perfección y salsa de chocolate.", 8000, "https://djftrby1k8irl.cloudfront.net/s3fs-public/2022-03%2FMOCHA%20LATTE-12.png?auto=format,compress&q=70&crop=focalpoint&ar=1:1.0&w=180&fit=crop");
        Cafe cafecito3 = new Cafe("abc113", "Dolce Canela Latte", "Latte", "Espresso colombiano con leche vaporizada, jarabe de canela dulce.", 6000, "https://djftrby1k8irl.cloudfront.net/s3fs-public/2022-03%2FDOLCE%20CANELA%20LATTE-07.png?auto=format,compress&q=70&crop=focalpoint&ar=1:1.0&w=180&fit=crop");
        Cafe cafecito4 = new Cafe("abc114", "Arequipe Latte", "Latte", "Espresso 100% colombiano con leche vaporizada a la perfección, combinado con salsa de arequipe, terminado con espiral de caramelo.", 7000, "https://djftrby1k8irl.cloudfront.net/s3fs-public/2022-03%2FAREQUIPE%20LATTE-02.png?auto=format,compress&q=70&crop=focalpoint&ar=1:1.0&w=180&fit=crop");

        cafesCitos.add(cafecito1);
        cafesCitos.add(cafecito2);
        cafesCitos.add(cafecito3);
        cafesCitos.add(cafecito4);
        cafesCitos.add(cafecito5);

        return cafesCitos;
    }

    // GESTIONAR CAFES

    //metodo mostrar
    public void mostrarCafes(ArrayList<Cafe> cafesCitos){

        System.out.println("\n --- CAFES --- ");
        cafesCitos.forEach((n) -> System.out.println("\n" + n.toString()));
    }

    //metodo agregar cafescito
    public void agregarCafescito(ArrayList<Cafe> cafesCitos){

        int indice = buscarCafe(cafesCitos);


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

    public void eliminarCafescito (ArrayList<Cafe> cafesCitos){
        System.out.println("Ingreser el codigo del cafescito a eliminar: ");
        String codigo = ingresoD.nextLine();

        for (int i = 0; i < cafesCitos.size(); i++) {
            if (codigo.equals(cafesCitos.get(i).getCodigo()))
            // buscamos cual de las patentes en la lista coincide con lo que el usuario escribió:
            {
                // Eliminamos un elemento de la lista utilizando .remove()
                cafesCitos.remove(i);
                System.out.println("Cafescito eliminado");
            }else {
                System.out.println("Cafescito no encontrado! Por favor intente de nuevo");
            }
        }
    }





    //metodo buscar
    public int buscarCafe (ArrayList<Cafe> cafesCitos) {

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


    //metodo actualizar nombre
    public void actualizarNombreC (int indice, ArrayList<Cafe> cafesCitos){


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


    public void actualizarTipoC (int indice, ArrayList<Cafe> cafesCitos){


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
    public void actualizarDescripcionC ( int indice, ArrayList<Cafe> cafesCitos){


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
    public void actualizarPrecioC ( int indice, ArrayList<Cafe> cafesCitos){


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
