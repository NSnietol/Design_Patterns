package designPatterns.patterns.Creationals.FactoryMethod.factories;

import designPatterns.patterns.Creationals.FactoryMethod.products.Car;





/**
 * Created by luisburgos on 15/07/15.
 */
public abstract class CarsFactory {
    public abstract Car createProduct(String productName);
}
