package designPatterns.patterns.Creationals.FactoryMethod.factories;

import designPatterns.patterns.Creationals.FactoryMethod.products.Car;




/**
 * Created by luisburgos on 15/07/15.
 */
public class CarsFactoryTestDrive {

    public static void main(String[] args) {

        CarsFactory factory;
        Car carCreated;

        factory = new NissanFactory();


        carCreated = factory.createProduct("tsuru");
        if (carCreated != null) {
            System.out.println(carCreated.getInformation());
        } else {
            System.out.println("No product created.");
        }


        carCreated = factory.createProduct("versa");
        if (carCreated != null) {
            System.out.println(carCreated.getInformation());
        } else {
            System.out.println("No product created.");
        }

        factory = new ToyotaFactory();


        carCreated = factory.createProduct("corolla");
        if (carCreated != null) {
            System.out.println(carCreated.getInformation());
        } else {
            System.out.println("No product created.");
        }

    
        carCreated = factory.createProduct("camry");
        if (carCreated != null) {
            System.out.println(carCreated.getInformation());
        } else {
            System.out.println("No product created.");
        }


        carCreated = factory.createProduct("spark");
        if (carCreated != null) {
            System.out.println(carCreated.getInformation());
        } else {
            System.out.println("No product created.");
        }

    }

}
