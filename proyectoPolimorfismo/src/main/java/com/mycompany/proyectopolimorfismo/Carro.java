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
public class Carro extends PoweredVehiculo{
    
    private String tamanoMotor;

    public Carro(String tamanoMotor, String tCombustible, String Marca) {
        super(tCombustible, Marca);
        this.tamanoMotor = tamanoMotor;
    }

    

    public String getTipoMotor() {
        return tamanoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tamanoMotor = tipoMotor;
    }
    
    
}
