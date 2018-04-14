package designPatterns.patterns.Creationals.FactoryMethod.products;



/**
 * Created by luisburgos on 15/07/15.
 */
public abstract class Car {

    private String agency;
    private String name;
    private double price;

    public Car(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getInformation(){
        return "Agency: " + getAgency() + ", Name: " + getName() + ", Price: " + getPrice();
    }
}
