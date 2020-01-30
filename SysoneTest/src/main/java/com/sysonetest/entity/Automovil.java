package com.sysonetest.entity;

import java.util.ArrayList;

public class Automovil {

    int precioBasico;
    TechoCorredizo techo;
    AireAcondicionado aire;
    FrenosAbs frenos;
    Airbag airbag;
    LlantasAleacion llantas;

    ArrayList comodidades;

    public Automovil() {
        precioBasico = 0;
        techo = null;
        aire =null;
        frenos = null;
        airbag = null;
        llantas =null;
        comodidades = new ArrayList();
        
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
    
    

}
