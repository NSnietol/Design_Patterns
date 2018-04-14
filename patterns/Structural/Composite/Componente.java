/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designPatterns.patterns.Structural.Composite;

/**
 *
 * @author ns
 */
public abstract class  Componente {
    
    protected String nombre;
    protected Componente padre;
    
    public Componente(String nombre){
        this.nombre=nombre;
        this.padre=this;
    }
    
    protected Componente compuesto(){
    
        return null;
    }
    
    protected void operacion(){
    
    }
    
    protected boolean añadir(Componente a){
    
        return false;
    }
   
    
     protected boolean eliminar(Componente a){
    
        return false;
    }
    
    protected Componente ObtenerHijo(int posicion){
    
        return null;
    }
    
    
    
    
    protected boolean Eliminar(Componente a){
    
        return true;
    }
    
}
