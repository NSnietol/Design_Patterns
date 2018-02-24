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
public class VisitorIVA implements Visitor{

    // En este ejemplo tenemos una reducción del IVA sobre los productos tecnologicos.
    
    private final double IVAnormal=0.19;
    private final double IVAtecnologia=0.12;

    public VisitorIVA() {
    }
    
    
    
    @Override
    public Double visitProduct(Lacteo product) {
        return product.getPrecio()*(1+IVAnormal);
    }

  @Override
    public Double visitProduct(Tecnologia product) {
      return product.getPrecio()*(1+IVAtecnologia);
    }


    
}
