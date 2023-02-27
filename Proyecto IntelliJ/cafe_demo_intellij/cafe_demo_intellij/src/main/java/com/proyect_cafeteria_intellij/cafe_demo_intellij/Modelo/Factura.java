package com.proyect_cafeteria_intellij.cafe_demo_intellij.Modelo;

import java.util.ArrayList;
public class Factura {

    private String codigo;
    private String nameCafeteria = "SDK Cafetería";
    private String direccion = "Calle 20 #19 a 15 - Las Palmeras Street";
    private String fechayhora;
    private Cliente clienteAux;
    private ArrayList<Postre> auxPostres;
    private ArrayList<Cafe> auxCafes;
    private String tipoPago;
    private int totalPago;

    //GETTER Y SETTER


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechayhora() {
        return fechayhora;
    }

    public void setFechayhora(String fechayhora) {
        this.fechayhora = fechayhora;
    }

    public Cliente getClienteAux() {
        return clienteAux;
    }

    public void setClienteAux(Cliente clienteAux) {
        this.clienteAux = clienteAux;
    }

    public ArrayList<Postre> getAuxPostres() {
        return auxPostres;
    }

    public void setAuxPostres(ArrayList<Postre> auxPostres) {
        this.auxPostres = auxPostres;
    }

    public ArrayList<Cafe> getAuxCafes() {
        return auxCafes;
    }

    public void setAuxCafes(ArrayList<Cafe> auxCafes) {
        this.auxCafes = auxCafes;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public int getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(int totalPago) {
        this.totalPago = totalPago;
    }
}
