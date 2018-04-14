/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designPatterns.patterns.Creationals.Builder;

/**
 *
 * @author ns
 */
public class ItalianBuilder implements PizzaBuilder {

    private Pizza pizza;

    public ItalianBuilder(){
    pizza = new Pizza();
    }
    
    
    
    @Override
    public boolean buildMasa() {
        this.pizza.setMasa(new Masa(("Base común")));

        return true;
    }

    @Override
    public boolean buildSalsa() {
        this.pizza.setSalsa("Salsa Italiana de Mostaza");

        return true;
    }

    @Override
    public boolean buildBase() {
   
        this.pizza.setBase(new Base("harina de trigo, sal, agua y levadura"));
        return true;
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;

    }

}
