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
public class Cliente {

    public static void main(String[] args) {

        Curso math = new Curso("Vectorial");

        Estudiante n = new Estudiante("RAMARICA");
        Estudiante n1 = new Estudiante("HAPOSE");
        Estudiante n2 = new Estudiante("Romario");
        Estudiante n3 = new Estudiante("Laura");
        Estudiante n4 = new Estudiante("Andrea");
        Estudiante n5 = new Estudiante("SYNTHEN");
        Estudiante n6 = new Estudiante("CRYSTALON");
        Estudiante n7 = new Estudiante("Natori");
        Estudiante n8 = new Estudiante("ZORTH");
        Estudiante n9 = new Estudiante("Nilson");

        math.agregarItem(n);
        math.agregarItem(n1);
        math.agregarItem(n2);
        math.agregarItem(n3);
        math.agregarItem(n4);
        math.agregarItem(n5);
        math.agregarItem(n6);
        math.agregarItem(n7);
        math.agregarItem(n8);
        math.agregarItem(n9);

        System.out.println("Lista de estudiantes");
        math.listar();

        System.out.println("\nLista filtrada por código filtrada");
        Iterador iterar = math.crearIterador();

        while (iterar.siguiente() != null) {

            System.out.println(iterar.elementoActual().getNombre() + " " + iterar.elementoActual().getCodigo());

        }

    }

}
