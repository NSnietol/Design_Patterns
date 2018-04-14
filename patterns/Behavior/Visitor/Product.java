/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designPatterns.patterns.Behavior.Visitor;

/**
 *
 * @author ns
 */
public abstract class Product {
    private String nombre;
    private String descripcion;
    private Double precio;

    public Product(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    
    public abstract Double visit(Visitor visitante);
    
    
    
}
