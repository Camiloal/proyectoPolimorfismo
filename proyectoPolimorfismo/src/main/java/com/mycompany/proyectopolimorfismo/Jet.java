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
        public String funcionPowered(){
        String ms="Soy un Jet Motorizado";
        return ms;
    }
        public String funcionJet(){
        String ms="Te acerco a lo que mas quieres";
        return ms;
    }

    public String getRecuentoMoto() {
        return recuentoMoto;
    }

    public void setRecuentoMoto(String recuentoMoto) {
        this.recuentoMoto = recuentoMoto;
    }
    
}
