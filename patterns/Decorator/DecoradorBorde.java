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
public class DecoradorBorde extends Decorador{

    private int width;
    public DecoradorBorde(Componente componente, int ancho) {
        super(componente);
    }

    @Override
    public boolean dibujar() {
        System.out.println("Con borde de tamaño : "+width);
        return super.dibujar(); //Tener cuidado con el llamo a los super
    }

    
    
    @Override
    public boolean cambiarTamaño() {
        return super.cambiarTamaño(); //To change body of generated methods, choose Tools | Templates.
    }
    


    
}
