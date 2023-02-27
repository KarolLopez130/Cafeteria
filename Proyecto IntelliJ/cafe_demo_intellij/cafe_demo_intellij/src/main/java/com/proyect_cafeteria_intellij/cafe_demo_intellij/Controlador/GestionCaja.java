package com.proyect_cafeteria_intellij.cafe_demo_intellij.Controlador;

import com.proyect_cafeteria_intellij.cafe_demo_intellij.Modelo.Cafe;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
public class GestionCaja {

    ArrayList<Cafe> cafesCitos = new ArrayList<>();

    public void CrearCafes() {
        Cafe cafecito1 = new Cafe("abc111", "Mocha Blanco Latte", "Mochas", "Espresso 100% colombiano con leche vaporizada, salsa de mocha blanco", 8000);
        Cafe cafecito2 = new Cafe("abc112", "Latte", "Latte", "Espresso colombiano con leche vaporizada, ligeramente cubierto con espuma.", 9000);
        Cafe cafecito3 = new Cafe("abc113", "Dolce Canela Latte", "Latte", "Espresso colombiano con leche vaporizada, jarabe de canela dulce.", 6000);
        Cafe cafecito4 = new Cafe("abc114", "Arequipe Latte", "Latte", "Espresso 100% colombiano con leche vaporizada a la perfección, combinado con salsa de arequipe, terminado con espiral de caramelo.", 7000);

        cafesCitos.add(cafecito1);
        cafesCitos.add(cafecito2);
        cafesCitos.add(cafecito3);
        cafesCitos.add(cafecito4);



        //Buscar
       //String CafecitoaBuscar = JOptionPane.showInputDialog("Ingrese el codigo: ");
        //if (cafesCitos.contains(CafecitoaBuscar)){
            //JOptionPane.showMessageDialog(null, "valor encontrado! ");
        //}else {
            //JOptionPane.showMessageDialog(null, "No se encontro el valor");
        //}

    }

}

