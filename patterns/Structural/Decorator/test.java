/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designPatterns.patterns.Structural.Decorator;


/**
 *
 * @author ns
 */
public class test {
    public static void main(String[] args) {
        
        //Podemos hacer un ComponenteVisual con borde y Desplazamiento
        Componente cm = new ComponenteVisual("Gamma");
        //cm.dibujar();
        cm = new DecoradorBorde(new DecoradorDesplazamiento(new ComponenteVisual("Gamma")), 0);
        cm.dibujar();
        
        
    }
    
}
