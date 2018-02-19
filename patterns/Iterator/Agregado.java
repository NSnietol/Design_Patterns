/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author ns
 */
public abstract class Agregado {

    abstract Iterador crearIterador();

    abstract boolean agregarItem(Estudiante nuevo);

    abstract boolean eliminarItem(Estudiante eliminar);

}
