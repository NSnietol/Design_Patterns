/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author ns
 */
public class Tecnologia extends Product{

    public Tecnologia(String nombre, Double precio) {
        super(nombre, precio);
    }

    @Override
    public Double visit(Visitor visitante) {
     return visitante.visitProduct(this);
    }
    
  
    
}
