package AbstractFactory.Clients;

import AbstractFactory.Factories.FabricaBarco;
import AbstractFactory.Factories.FabricaBarcoSimple;

/**
 * Created by luisburgos on 17/07/15.
 */
public class BarcoSimple extends Barco {

    private FabricaBarco shipFactory;

    public BarcoSimple(){
        setName("UFO Ship");
        this.shipFactory = new FabricaBarcoSimple();
    }

    @Override
    public void makeShip(){
        System.out.println("Making new " + getName());
        setShipEngine(shipFactory.makeShipEngine());
        setShipWeapon(shipFactory.makeShipGun());
    }

}
