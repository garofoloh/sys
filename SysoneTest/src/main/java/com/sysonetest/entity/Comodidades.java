package com.sysonetest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


public class Comodidades {
    TechoCorredizo techo;
    AireAcondicionado aire;
    FrenosAbs frenos;
    Airbag airbag;
    LlantasAleacion llantas;
    @Id
    private Long id;

    public Comodidades() {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
