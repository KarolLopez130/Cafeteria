package com.proyect_cafeteria_intellij.cafe_demo_intellij.Modelo;

public class Cafe {
    //SILKEY
    private String codigo;
    private String nombre;
    private String tipo;
    private String tamaño;
    private String descripcion;
    private int cantidad;
    private int precio;

    public Cafe(String codigo, String nombre, String tipo, String tamaño, String descripcion, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Cafe(String codigo, String nombre, String tipo, String descripcion, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.precio = precio;
    }


    //GETTER Y SETTER

    public  String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public  String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public  String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public  String getDescripcion() {return descripcion;}

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public  int getPrecio() {return precio;}

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + '\'' +
                "Nombre: " + nombre + '\'' +
                "Tipo: " + tipo + '\'' +
                "Tamaño: " + tamaño + '\'' +
                descripcion + '\'' +
                "Precio: $" + precio + '}';
    }
}
