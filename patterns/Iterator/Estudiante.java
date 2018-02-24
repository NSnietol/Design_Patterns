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
public class Estudiante {
    
    private String nombre;
    private String codigo;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        java.util.Random geneador = new java.util.Random ();
        this.codigo="0"+geneador.nextInt(15)+"";
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    
}
