/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designPatterns.patterns.Behavior.Strategy;

/**
 *
 * @author ns
 */
public class SistemaLineal {

    
    /*
    Los demás atributos
     */
    private final int tipo;
    private MetodoSolucion solver;

    public SistemaLineal( int tipo) {
        this.tipo=tipo;
    
    }

    
    
    
    private String solucion() {

        switch (this.tipo){
            
            case 1: solver = new MetodoSolucion1();
            case 2: solver = new MetodoSolucion2();
        
        }
        solver.resolver();

        return "Solved";

    }

}
