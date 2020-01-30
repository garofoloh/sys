package com.sysonetest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comodidades")
public class Comodidades {
    String nombre;
    int precio;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "comodidadesID")
    private Long id;

    public Comodidades() {
    }

    public Comodidades(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    

}
