/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designPatterns.patterns.Behavior.Iterator;

import java.util.ArrayList;

/**
 *
 * @author ns
 */
public class Curso extends Agregado{
    
    private final String nombre;
    private final ArrayList<Estudiante> lista;

    public Curso(String nombre) {
        this.nombre = nombre;
        lista= new ArrayList<>();
    }

    
    
    public void listar(){
        lista.forEach((estudiante) -> {
            System.out.println(estudiante.getNombre()+" : "+estudiante.getCodigo());
        });
    
    }
    
    @Override
    Iterador crearIterador() {
       
        return new IterradorCursoCodigo(lista,"1");
        
    }

    @Override
    boolean agregarItem(Estudiante nuevo) {
     return lista.add(nuevo);
    }

    @Override
    boolean eliminarItem(Estudiante eliminar) {
       
        return lista.remove(eliminar);
    }

    
    
    
}
