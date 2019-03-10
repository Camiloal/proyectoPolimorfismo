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
public class Patineta extends Vehiculo{
    private String logitudTabla;

    public Patineta(String logitudTabla, String Marca) {
        super(Marca);
        this.logitudTabla = logitudTabla;
    } 
    
    @Override
     public String funcionVehiculo(){
         String ms = "Soy una Patineta";
        return ms;
    }
    public String funcionPatineta(){
      String ms = "Soy Deporte y Cultura";
      return ms;
    }
    public String getLogitudTabla() {
        return logitudTabla;
    }

    public void setLogitudTabla(String logitudTabla) {
        this.logitudTabla = logitudTabla;
    }
    
    
}
