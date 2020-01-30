package com.sysonetest.entity;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "automoviles")
public class Automovil implements Serializable {

    int precioBasico;
    String nombre;
    TechoCorredizo techo;
    AireAcondicionado aire;
    FrenosAbs frenos;
    Airbag airbag;
    LlantasAleacion llantas;

    ArrayList comodidades;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "automovilId")
    private Long id;

    public Automovil() {
        nombre = null;
        precioBasico = 0;
        techo = null;
        aire = null;
        frenos = null;
        airbag = null;
        llantas = null;

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

    public TechoCorredizo getTecho() {
        return techo;
    }

    public void setTecho(TechoCorredizo techo) {
        this.techo = techo;
    }

    public AireAcondicionado getAire() {
        return aire;
    }

    public void setAire(AireAcondicionado aire) {
        this.aire = aire;
    }

    public FrenosAbs getFrenos() {
        return frenos;
    }

    public void setFrenos(FrenosAbs frenos) {
        this.frenos = frenos;
    }

    public Airbag getAirbag() {
        return airbag;
    }

    public void setAirbag(Airbag airbag) {
        this.airbag = airbag;
    }

    public LlantasAleacion getLlantas() {
        return llantas;
    }

    public void setLlantas(LlantasAleacion llantas) {
        this.llantas = llantas;
    }

    public ArrayList getComodidades() {
        return comodidades;
    }

    public void setComodidades(ArrayList comodidades) {
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
