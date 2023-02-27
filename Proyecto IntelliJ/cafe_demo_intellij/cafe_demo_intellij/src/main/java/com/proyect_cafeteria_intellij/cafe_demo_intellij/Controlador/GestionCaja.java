package com.proyect_cafeteria_intellij.cafe_demo_intellij.Controlador;

import com.proyect_cafeteria_intellij.cafe_demo_intellij.Modelo.Postre;

import java.util.ArrayList;

public class GestionCaja {


    ArrayList<Postre> postresAux = new ArrayList<>();
    public void crearPostres(){
        //KAROL

        Postre postre1 = new Postre("pst111", "Rollo de Canela", "Rollo", "Exquisito rollo francés relleno de canela.", 6000);
        Postre postre2 = new Postre("pst112", "Muffin de Chocolate", "Muffin", "Muffin de chocolate, horneado con trozos de chocolate.", 5500);
        Postre postre3 = new Postre("pst113", "Muffin Arándanos", "Rollo", "Exquisito rollo francés relleno de canela.", 6000);
        Postre postre4 = new Postre("pst114", "Rollo de Canela", "Rollo", "Exquisito rollo francés relleno de canela.", 6000);

        postresAux.add(postre1);
        postresAux.add(postre2);
        postresAux.add(postre3);
        postresAux.add(postre4);

    }
    public void gestionarOtros(){

        int opcion = 0;
        while (opcion != 4){

            System.out.println("\n --- GESTIÓN --- " +
                    "\n1. Gestion Productos\n2. Ver Pedidos Actuales\n3. Gestionar Otros\n4. Cerrar Cafetería");

        }

    }

}
