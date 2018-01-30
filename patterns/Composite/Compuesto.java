/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;

/**
 *
 * @author ns
 */
public class Compuesto extends Componente{
    
    
    ArrayList<Componente> elementos;
            
    
    public Compuesto(String nombre) {
       
        super(nombre);
        
        this.elementos = new ArrayList<>();
    }

    @Override
    protected Componente compuesto() {
        return this;
    }
    
   
    @Override
    protected void operacion() {
        System.out.println("Operación sobre escrita");
    
    }

    @Override
    protected boolean añadir(Componente a) {
        return elementos.add(a); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean eliminar(Componente a) {
        
        return elementos.remove(a); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    protected Componente ObtenerHijo(int posicion) {
        
        if( elementos.size()>0){
            return elementos.get(posicion); //To change body of generated methods, choose Tools | Templates.
        }else return null;
    }
    
    

    
    
    
    
}
