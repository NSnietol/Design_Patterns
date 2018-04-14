package designPatterns.patterns.Creationals.FactoryMethod.factories;

import designPatterns.patterns.Creationals.FactoryMethod.products.Car;
import designPatterns.patterns.Creationals.FactoryMethod.products.Tsuru;
import designPatterns.patterns.Creationals.FactoryMethod.products.Versa;




/**
 * Created by luisburgos on 15/07/15.
 */
public class NissanFactory extends CarsFactory {
    @Override
    public Car createProduct(String productName) {
        Car car = null;

        if(productName.equalsIgnoreCase("TSURU")){
            car = new Tsuru();
        }else if(productName.equalsIgnoreCase("VERSA")){
            car = new Versa();
        }

        return car;
    }
}
