package designPatterns.patterns.Creationals.AbstractFactory.Factories;

import designPatterns.patterns.Creationals.AbstractFactory.Products.Arma;
import designPatterns.patterns.Creationals.AbstractFactory.Products.Motor;







/**
 * Created by luisburgos on 16/07/15.
 */
public abstract class FabricaBarco {

    public abstract Arma makeShipGun();
    public abstract Motor makeShipEngine();

}
