package com.proyect_cafeteria_intellij.cafe_demo_intellij.Controlador;

import com.proyect_cafeteria_intellij.cafe_demo_intellij.Sevicios.GestionCafe;

import java.util.Scanner;

public class ControladorCaja {

    Scanner ingresoD = new Scanner(System.in);
    ControladorPostre CPostre = new ControladorPostre();
    ControladorCafe CCafe = new ControladorCafe();
    GestionCafe GCafe = new GestionCafe();





    public void gestionarOtros(){

        int opcion = 0;
        while (opcion != 3){

            System.out.println("\n --- GESTIÓN --- " +
                    "\n1. Gestion Productos\n2. Ver Pedidos Actuales\n3. Volver");

            opcion = ingresoD.nextInt();

            switch (opcion){

                case 1:
                    int opcion1 = 0;
                    while (opcion1 !=  7){

                        System.out.println("\n --- 1. GESTIÓN PRODUCTOS --- " +
                                "\n1. Actualizar Cafe\n2. Actualizar Postre\n3. Añadir Cafe\n4. Añadir Postre\n5. Eliminar Cafe \n6. Eliminar Postre\n7. Volver");
                        opcion1 = ingresoD.nextInt();

                        switch (opcion1){

                            case 1:
                                CCafe.actualizarCafe();
                                break;

                            case 2:
                                CPostre.actualizarPostre();
                                break;

                            case 3:
                                GCafe.agregarCafescito(CCafe.getCafescitos());

                                break;

                            case 4:

                                break;
                            case 5:
                                GCafe.eliminarCafescito(CCafe.getCafescitos());
                                break;

                            case 6:
                                break;

                            case 7:
                                System.out.println("\nVolviendo ...");
                                break;

                        }

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
