package FactoryMethod.factories;



import FactoryMethod.products.Camry;
import FactoryMethod.products.Car;
import FactoryMethod.products.Corolla;

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
