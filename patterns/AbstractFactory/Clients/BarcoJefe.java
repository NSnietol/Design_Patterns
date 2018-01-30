package AbstractFactory.Clients;

import AbstractFactory.Factories.FabricaBarco;
import AbstractFactory.Factories.FabricaBarcoJefe;

/**
 * Created by luisburgos on 17/07/15.
 */
public class BarcoJefe extends Barco {

    private FabricaBarco shipFactory;

    public BarcoJefe(){
        setName("UFO Boss Ship");
        this.shipFactory = new FabricaBarcoJefe();
    }

    @Override
    public void makeShip(){
        System.out.println("Making new " + getName());
        setShipEngine(shipFactory.makeShipEngine());
        setShipWeapon(shipFactory.makeShipGun());
    }

}
