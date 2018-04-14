package designPatterns.patterns.Creationals.AbstractFactory.Factories;

import designPatterns.patterns.Creationals.AbstractFactory.Products.Arma;
import designPatterns.patterns.Creationals.AbstractFactory.Products.ArmaBarcoSimple;
import designPatterns.patterns.Creationals.AbstractFactory.Products.Motor;
import designPatterns.patterns.Creationals.AbstractFactory.Products.MotorBarcoSimple;


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
