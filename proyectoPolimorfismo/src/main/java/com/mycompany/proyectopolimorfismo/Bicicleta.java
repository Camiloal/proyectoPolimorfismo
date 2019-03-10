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
public class Bicicleta extends Vehiculo{
    private String tipoEquipo;

    public Bicicleta(String tipoEquipo, String Marca) {
        super(Marca);
        this.tipoEquipo = tipoEquipo;
    }

    public Bicicleta() {
    }

    @Override
    public String funcionVehiculo(){
       String ms = "Soy una Bibicleta";
        return ms;
    }

    public String funcionBicicleta(){
        String ms="No contamino, Cuido el planeta";
        return ms;
    }
    public String getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(String tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }
    
    
}
