package FactoryMethod.factories;



import FactoryMethod.products.Car;
import FactoryMethod.products.Tsuru;
import FactoryMethod.products.Versa;

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
