package com.example.cristian.ieat.models;

/**
 * Created by Cristian on 22/06/2017.
 */

public class Producto {
    private int id,precio,numVendidos;
    private String nombre, img;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNumVendidos() {
        return numVendidos;
    }

    public void setNumVendidos(int numVendidos) {
        this.numVendidos = numVendidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
