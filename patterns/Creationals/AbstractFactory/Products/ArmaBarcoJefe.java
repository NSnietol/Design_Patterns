package designPatterns.patterns.Creationals.AbstractFactory.Products;

/**
 * Created by luisburgos on 16/07/15.
 */
public class ArmaBarcoJefe implements Arma {
    @Override
    public String getShipWeaponInformation() {
        return "50 damage";
    }
}
