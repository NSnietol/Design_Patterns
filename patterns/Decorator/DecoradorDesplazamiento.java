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
public class DecoradorDesplazamiento extends Decorador{
    
    public DecoradorDesplazamiento(Componente componente) {
        super(componente);
    }

    @Override
    public boolean dibujar() {
        System.out.println("Desplazamiento");
        return super.dibujar(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
