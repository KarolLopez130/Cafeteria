package com.cafeteria.cafeteriaDemo.Entidades;

public class Postre {

    private String codigo;
    private String nombre;
    private String tipo;
    private String descripcion;

    private int cantidad;
    private int precio;
    private String imagen;

    public Postre(String codigo, String nombre, String tipo, String descripcion, int precio,String imagen) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagen = imagen;
    }


    //GETTER Y SETTER

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + '\n' +
                "Nombre: " + nombre + '\n' +
                "Tipo: " + tipo + '\n' +
                descripcion + '\n' +
                "Precio: $" + precio + '\n';
    }

}
