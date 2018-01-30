/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author ns
 */
public class ComponenteVisual extends Componente{
    
    private String datos;

    public ComponenteVisual(String cadena) {
        this.datos=cadena;
    }

    
    
    @Override
    public boolean dibujar() {
        System.out.println("Dibujado a "+datos);
        return true;
    }

    @Override
    public boolean cambiarTamaño() {
    
       System.out.println("Tamaño cambiado");
       return true;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }
    
    
    
    


    
}
