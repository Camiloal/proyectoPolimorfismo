/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectopolimorfismo;

/**
 *
 * @author CamiloAlvarez
 */
public abstract class PoweredVehiculo extends Vehiculo{
    
    private String tCombustible;

    public PoweredVehiculo(String tCombustible, String Marca) {
        super(Marca);
        this.tCombustible = tCombustible;
    }

    public String funcionPowered(){
        String ms="Soy un Motorizado";
        return ms;
    }

    public String gettCombustible() {
        return tCombustible;
    }

    public void settCombustible(String tCombustible) {
        this.tCombustible = tCombustible;
    }
    
    
}
