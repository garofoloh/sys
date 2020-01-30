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
    @Column(columnDefinition ="Integer(10) default '0'")
    int precioFinal;

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

    public Automovil() {
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

    public int getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(int precioFinal) {
        this.precioFinal = precioFinal;
    }
    
    public int calcularPrecio(Automovil auto,List<Comodidad> comodidades) {
        precioFinal += auto.precioBasico;
        for(int i =0; i<comodidades.size();i++){
            precioFinal += comodidades.get(i).getPrecio();
        }
        this.setPrecioFinal(precioFinal);
        return precioFinal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
