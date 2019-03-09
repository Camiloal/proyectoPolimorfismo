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

 

    public void funcionBicicleta(){
        
    }
    public String getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(String tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }
    
    
}
