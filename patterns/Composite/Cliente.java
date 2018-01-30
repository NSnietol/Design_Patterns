
package Composite;

/**
 *
 * @author ns
 */
public class Cliente {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Compuesto al = new Compuesto("Composite");
        
        
        Hoja a = new Hoja("Leaf");
        System.out.println(a.nombre);
        
        System.out.println(al.ObtenerHijo(0));
        
    }
    
}
