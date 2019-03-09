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
public class Jet extends PoweredVehiculo{
    
    private String  recuentoMoto;

    public Jet(String recuentoMoto, String tCombustible, String Marca) {
        super(tCombustible, Marca);
        this.recuentoMoto = recuentoMoto;
    }

       @Override
        public void funcionPowered(){
        String ms="Soy un Jet Motorizado";
    }

    public String getRecuentoMoto() {
        return recuentoMoto;
    }

    public void setRecuentoMoto(String recuentoMoto) {
        this.recuentoMoto = recuentoMoto;
    }
    
}
