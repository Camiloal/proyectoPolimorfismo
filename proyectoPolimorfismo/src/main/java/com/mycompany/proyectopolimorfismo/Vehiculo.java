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

public abstract class  Vehiculo {
    
    private String Marca;

    public Vehiculo() {
   
       }

    public Vehiculo(String Marca) {
        this.Marca = Marca;
    }
    
    public String funcionVehiculo(){
         String ms = "Soy un Vehiculo";
        return ms;
}

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    
    
}
