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

    @Override
    public void funcionVehiculo(){
       String ms = "Soy una Bibicleta  Marca";
        
    }

    public void funcionBicicleta(){
        System.out.println("No contamino, Cuido el planeta");
    }
    public String getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(String tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }
    
    
}
