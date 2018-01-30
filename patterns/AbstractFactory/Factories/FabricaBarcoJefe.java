package AbstractFactory.Factories;

import AbstractFactory.Products.MotorBarcoJefe;
import AbstractFactory.Products.ArmaBarcoJefe;
import AbstractFactory.Products.Motor;
import AbstractFactory.Products.Arma;

/**
 * Created by luisburgos on 16/07/15.
 */
public class FabricaBarcoJefe extends FabricaBarco {
    @Override
    public Arma makeShipGun() {
        return new ArmaBarcoJefe();
    }

    @Override
    public Motor makeShipEngine() {
        return new MotorBarcoJefe();
    }
}
