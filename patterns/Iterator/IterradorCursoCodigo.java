/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.util.ArrayList;

/**
 *
 * @author ns
 */
public class IterradorCursoCodigo extends Iterador{

    private ArrayList<Estudiante> lista;
    private Estudiante actual;
    private int posicion = 0;
    private String criterio="";

    public IterradorCursoCodigo(ArrayList<Estudiante> lista,String criterio) {
        this.lista = (ArrayList<Estudiante>) lista.clone();
        this.criterio= criterio;
    }
    
    
    
 

    @Override
    Estudiante siguiente() {
        
        while(haTerminado()==false){
           
            if(this.lista.get(posicion).getCodigo().endsWith(criterio)){
        
           
                     actual=lista.get(posicion);
                     posicion++;
                     return actual;
                    
             
            }
            
            
            posicion++;
        }
     return null;
    }

    @Override
    boolean haTerminado() {
      
        return posicion== (lista.size()-1);
        
    }

    @Override
    Estudiante elementoActual() {
          return actual;
    }
    
}
