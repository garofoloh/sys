package com.sysonetest.entity;


class AireAcondicionado {
    int precio;
    String nombre;

    public AireAcondicionado() {
        precio =20000;
        nombre="AA";
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
