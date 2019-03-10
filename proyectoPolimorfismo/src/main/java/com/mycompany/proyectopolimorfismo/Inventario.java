/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectopolimorfismo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CamiloAlvarez
 */
public class Inventario {
    
    private List<Vehiculo> listaVehiculo = new ArrayList<>();
    int op;
    public void menu(){
        
        System.out.println("Ordenar Por:");
        System.out.println("1.Bicicleta:");
        System.out.println("2.Patineta");
        
        
        
        
    }
    
    public void mostrar(List<Vehiculo> lista){
        
        
        for(Vehiculo vehiculo : lista){
            
            if(vehiculo instanceof Bicicleta){
                System.out.println(((Bicicleta)vehiculo).funcionVehiculo());
                System.out.println(((Bicicleta)vehiculo).funcionBicicleta());
                
                System.out.println("Marca: "+((Bicicleta)vehiculo).getMarca()+"  Tipo: "+((Bicicleta)vehiculo).getTipoEquipo());
                
                
            }
            
            if(vehiculo instanceof Patineta){
                
                System.out.println(((Patineta)vehiculo).funcionVehiculo());
                System.out.println(((Patineta)vehiculo).funcionPatineta());
                
                System.out.println("Marca: "+((Patineta)vehiculo).getMarca()+"  Longitud: "+((Patineta)vehiculo).getLogitudTabla());
                
            }
        }
    }
    public void cargarDatos(){
      
        Vehiculo bici1 = new Bicicleta("Todo Terreno", "Trek");
        Vehiculo bici2 = new Bicicleta("Pistera", "Scott");
        Vehiculo bici3 = new Bicicleta("BMX", "Orbea");
       
        Vehiculo pat1 = new  Patineta("60cm", "Skate Zero");
        Vehiculo pat2 = new  Patineta("40cm", "Powell");
        Vehiculo pat3 = new  Patineta("50cm", "Element");

        

        listaVehiculo.add(bici1);
        listaVehiculo.add(bici2);
        listaVehiculo.add(bici3);        
        
        listaVehiculo.add(pat1);
        listaVehiculo.add(pat2);
        listaVehiculo.add(pat3); 
        
        mostrar(listaVehiculo);
     }
    
    
    
}