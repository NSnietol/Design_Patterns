/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designPatterns.patterns.Structural.Decorator;


/**
 *Tener en cuenta en el override que lo que realice este padre lo podrán usar sus hijos
 * @author ns
 */
public  class Decorador extends Componente{

    
    Componente _componente;

    public Decorador(Componente componente) {
        _componente=componente;
    }
    
    
    
    @Override
    public boolean dibujar() {

        return _componente.dibujar();
        
    }

    @Override
    public boolean cambiarTamaño() {

        return _componente.dibujar();

    }
    
    
    
}
