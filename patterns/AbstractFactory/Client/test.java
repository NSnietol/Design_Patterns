package AbstractFactory.Client;

import AbstractFactory.Clients.Barco;
import AbstractFactory.Clients.BarcoJefe;
import AbstractFactory.Clients.BarcoSimple;




/**
 * Created by luisburgos on 17/07/15.
 */
public class test {

    public static void main(String[] args) {

        Barco ship;
        String typeShip;

      
        typeShip = "ufo";
        if(typeShip.equalsIgnoreCase("ufo")){
            ship = new BarcoSimple();
            ship.makeShip();
            System.out.println(ship.toString());
        }

        typeShip = "boss";
        if(typeShip.equalsIgnoreCase("boss")){
            ship = new BarcoJefe();
            ship.makeShip();
            System.out.println(ship.toString());
        }

    }

}
