package com.cafeteria.cafeteriaDemo.Controlador;

import com.cafeteria.cafeteriaDemo.Entidades.Cafe;
import com.cafeteria.cafeteriaDemo.Entidades.Postre;
import com.cafeteria.cafeteriaDemo.Servicios.ServicioCafe;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Scanner;

@CrossOrigin (origins = "*", maxAge = 3600)
@RestController
public class ControladorCafe {

    Scanner ingresoD = new Scanner(System.in);

    ServicioCafe GCafes = new ServicioCafe();

    @GetMapping("/MostrarCafes")
    public ArrayList<Cafe> listarCafes(){
        return GCafes.mostrarCafesitos();
    }


    @PostMapping("/AgregarCafe")
    public String addCafe(@RequestBody Cafe cafesito){
        return GCafes.agregarCafesito(cafesito);
    }

    @PutMapping("/ActualizarCafe")
    public String updateCafe(@RequestBody Cafe cafesito){
        return GCafes.editarCafesito(cafesito);
    }

    @DeleteMapping("/BorrarCafe")
    public String deleteCafe(@RequestBody Cafe cafesito){

        return GCafes.borrarCafesito(cafesito);
    }

    /*public ArrayList<Cafe> getCafescitos() {
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

    }*/

}
