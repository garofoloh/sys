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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "automoviles")
public class Automovil implements Serializable {

    int precioBasico;
    String nombre;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "automoviles_comodidades", joinColumns = @JoinColumn(name = "automovil_Id"), inverseJoinColumns = @JoinColumn(name = "comodidadID"))
    List<Comodidad> comodidades;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "automovil_Id")
    private Long id;

    public Automovil(Long id, String nombre, int precioBasico) {
        this.nombre = nombre;
        this.id = id;

        this.precioBasico = precioBasico;


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

    public List<Comodidad> getComodidades() {
        return comodidades;
    }

    public void setComodidades(List<Comodidad> comodidades) {
        this.comodidades = comodidades;
    }
    
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
