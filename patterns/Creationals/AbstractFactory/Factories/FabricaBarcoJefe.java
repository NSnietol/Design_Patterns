package designPatterns.patterns.Creationals.AbstractFactory.Factories;

import designPatterns.patterns.Creationals.AbstractFactory.Products.Arma;
import designPatterns.patterns.Creationals.AbstractFactory.Products.ArmaBarcoJefe;
import designPatterns.patterns.Creationals.AbstractFactory.Products.Motor;
import designPatterns.patterns.Creationals.AbstractFactory.Products.MotorBarcoJefe;



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
