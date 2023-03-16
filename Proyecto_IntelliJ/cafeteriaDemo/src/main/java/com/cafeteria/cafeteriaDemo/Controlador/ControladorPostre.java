package com.cafeteria.cafeteriaDemo.Controlador;

import com.cafeteria.cafeteriaDemo.Entidades.Postre;
import com.cafeteria.cafeteriaDemo.Servicios.ServicioPostre;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ControladorPostre {

    ServicioPostre GPostres = new ServicioPostre();
    //ArrayList<Postre> postresAux = GPostres.crearPostres();
    //Scanner ingresoD = new Scanner(System.in);

    @GetMapping("/saludito")
    public String saludo(){
        return "Hola Mundo";

    }

    @GetMapping("/MostrarPostres")
    public ArrayList<Postre> listarPostres(){
        return GPostres.mostrarPostres();
    }

    /*
    public ArrayList<Postre> getPostresAux(){
        return postresAux;

    }

    public void actualizarPostre(){

        int opcion = 0;
        GPostres.mostrarPostres(postresAux);
        int indice = GPostres.buscarPostre(postresAux);

        while (opcion != 5){

            System.out.println(postresAux.get(indice).toString());

            if (indice < postresAux.size()){

                System.out.println("\n --- 2. ACTUALIZAR POSTRE --- " +
                        "\n1. Actualizar Nombre\n2. Actualizar Tipo\n3. Actualizar Descripción\n4. Actualizar Precio\n5. Volver");
                opcion = ingresoD.nextInt();

                switch (opcion){

                    case 1:
                        GPostres.actualizarNombreP(indice, postresAux);
                        break;

                    case 2:
                        GPostres.ActualizarTipoP(indice, postresAux);
                        break;

                    case 3:
                        GPostres.ActualizarDescripcionP(indice, postresAux);
                        break;

                    case 4:
                        GPostres.actualizarPrecioP(indice, postresAux);
                        break;

                    case 5:
                        System.out.println("\nVolviendo ...");
                        break;

                }

            } else {

                System.out.println("Intenta de nuevo con un codigo existente.");

            }

        }

    }*/

}
