package com.sysonetest.entity;


public class TechoCorredizo {
    int precio;
    String nombre;

    public TechoCorredizo() {
        precio = 12000;
        nombre = "TC";
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
