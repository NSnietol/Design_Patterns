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
public interface Visitor {

    public Double visitProduct(Lacteo a);

    public Double visitProduct(Tecnologia a);
}
