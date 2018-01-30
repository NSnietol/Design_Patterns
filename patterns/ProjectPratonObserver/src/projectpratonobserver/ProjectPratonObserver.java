/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpratonobserver;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NS
 */
public class ProjectPratonObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno ns = new Alumno();
        Asignatura seminario = new Asignatura(5,4.4, 3);
        
        seminario.addObserver(ns);
        
        seminario.cambiarMensaje("Cambiando... tercera nota");
        seminario.setCorte3(5);
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProjectPratonObserver.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(ns.getSeminarioVacacional().getCorte3());
    }
    
}
