package designPatterns.patterns.Creationals.AbstractFactory.Clients;

import designPatterns.patterns.Creationals.AbstractFactory.Products.Arma;
import designPatterns.patterns.Creationals.AbstractFactory.Products.Motor;





/**
 * Created by luisburgos on 16/07/15.
 */
public abstract class Barco {

    private String name;
    private Arma shipWeapon;
    private Motor shipEngine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Motor getShipEngine() {
        return shipEngine;
    }

    public void setShipEngine(Motor shipEngine) {
        this.shipEngine = shipEngine;
    }

    public Arma getShipWeapon() {
        return shipWeapon;
    }

    public void setShipWeapon(Arma shipWeapon) {
        this.shipWeapon = shipWeapon;
    }

    @Override
    public String toString() {
        return "NAME: " + getName() +
                " | ENGINE: "+ shipEngine.getShipEngineInformation() +
                " | WEAPON: " + shipWeapon.getShipWeaponInformation();
    }

    public abstract void makeShip();
}
