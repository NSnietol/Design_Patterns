package AbstractFactory.Products;

/**
 * Created by luisburgos on 16/07/15.
 */
public class ArmaBarcoSimple implements Arma {
    @Override
    public String getShipWeaponInformation() {
        return "20 damage";
    }
}
