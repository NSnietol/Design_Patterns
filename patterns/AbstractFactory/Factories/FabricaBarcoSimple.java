package AbstractFactory.Factories;

import AbstractFactory.Products.MotorBarcoSimple;
import AbstractFactory.Products.ArmaBarcoSimple;
import AbstractFactory.Products.Motor;
import AbstractFactory.Products.Arma;

/**
 * Created by luisburgos on 16/07/15.
 */
public class FabricaBarcoSimple extends FabricaBarco {
    @Override
    public Arma makeShipGun() {
        return new ArmaBarcoSimple();
    }

    @Override
    public Motor makeShipEngine() {
        return new MotorBarcoSimple();
    }
}
