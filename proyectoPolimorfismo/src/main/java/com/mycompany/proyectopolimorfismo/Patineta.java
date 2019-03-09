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
    private double logitudTabla;

    public Patineta(double logitudTabla, String Marca) {
        super(Marca);
        this.logitudTabla = logitudTabla;
    } 
    public void funcionPatineta(){
        
    }
    public double getLogitudTabla() {
        return logitudTabla;
    }

    public void setLogitudTabla(double logitudTabla) {
        this.logitudTabla = logitudTabla;
    }
    
    
}
