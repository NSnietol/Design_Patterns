/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpratonobserver;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author NS
 */
public class Alumno implements Observer{
    
 
    private Asignatura nombre;
    
    
    

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Nueva Actualizacion: "+o+" -> ");
        nombre= (Asignatura)arg;
    }

    public Asignatura getSeminarioVacacional() {
        return nombre;
    }

    public void setSeminarioVacacional(Asignatura seminarioVacacional) {
        this.nombre = seminarioVacacional;
    }
}
