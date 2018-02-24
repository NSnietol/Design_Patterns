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
public class Client {

    public static void main(String[] args) {

        VisitorIVA IVAColombia = new VisitorIVA();

        Lacteo queso = new Lacteo("Queso Suizo", 15000.0);
        Lacteo leche = new Lacteo("Leche Deslactosada ", 5500.0);
        Tecnologia mouse = new Tecnologia("Mouse HP", 34000.0);

        System.out.println("Precio del " + queso.getNombre() + "es : " + queso.visit(IVAColombia));
        System.out.println("Precio del " + leche.getNombre() + "es : " + leche.visit(IVAColombia));

        
         System.out.println("Precio del "+mouse.getNombre()+"es : "+mouse.visit(IVAColombia));
        
    }

}
