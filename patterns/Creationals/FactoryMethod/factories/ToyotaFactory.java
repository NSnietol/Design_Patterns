package designPatterns.patterns.Creationals.FactoryMethod.factories;

import designPatterns.patterns.Creationals.FactoryMethod.products.Camry;
import designPatterns.patterns.Creationals.FactoryMethod.products.Car;
import designPatterns.patterns.Creationals.FactoryMethod.products.Corolla;



/**
 * Created by luisburgos on 15/07/15.
 */
public class ToyotaFactory extends CarsFactory {
    @Override
    public Car createProduct(String productName) {
        Car car = null;

        if(productName.equalsIgnoreCase("CAMRY")){
            car = new Camry();
        }else if(productName.equalsIgnoreCase("COROLLA")){
            car = new Corolla();
        }

        return car;
    }
}
