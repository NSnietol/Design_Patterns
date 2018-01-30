package AbstractFactory.Factories;

import AbstractFactory.Products.Motor;
import AbstractFactory.Products.Arma;


/**
 * Created by luisburgos on 16/07/15.
 */
public abstract class FabricaBarco {

    public abstract Arma makeShipGun();
    public abstract Motor makeShipEngine();

}
