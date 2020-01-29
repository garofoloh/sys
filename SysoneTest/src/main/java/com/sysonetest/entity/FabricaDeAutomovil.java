package com.sysonetest.entity;

public abstract class FabricaDeAutomovil {

        
    public static Automovil crearAutomovil(int cualAutomovil) {
        FabricaDeAutomovil fabricaDeAutomovil = null;
        switch (cualAutomovil) {
            case 1:
                fabricaDeAutomovil = new FabricaDeAutomvilesSedan();
            case 2:
                fabricaDeAutomovil = new FabricaDeAutomvilesCoupe();
            case 3:
                fabricaDeAutomovil = new FabricaDeAutomvilesFamiliar();
                break;
        }
        return fabricaDeAutomovil.crearAutomovil();
    }

    public abstract Automovil crearAutomovil();
    public abstract String MostrarPrecio();
}
