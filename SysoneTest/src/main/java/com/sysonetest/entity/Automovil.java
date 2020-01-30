package com.sysonetest.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "automoviles")
public class Automovil implements Serializable {

    int precioBasico;
    String nombre;
    
   // @ManyToMany(cascade = CascadeType.PERSIST)
    //@JoinTable(name = "automovil_comodidades", joinColumns = @JoinColumn(name = "automovilId"), inverseJoinColumns = @JoinColumn(name = "comodidadesID"))
    //List comodidades;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "automovilId")
    private Long id;

    public Automovil(String nombre) {
        this.nombre = nombre;
        
        switch (nombre){
            case "sedan":
                precioBasico = 230000;
            case "familiar":
                precioBasico = 245000;
            case "coupe":
                precioBasico = 270000;
        }
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioBasico() {
        return precioBasico;
    }

    public void setPrecioBasico(int precioBasico) {
        this.precioBasico = precioBasico;
    }

   /* public List getComodidades() {
        return comodidades;
    }

    public void setComodidades(List comodidades) {
        this.comodidades = comodidades;
    }
    */
    public int MostrarPrecio() {
        return 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
