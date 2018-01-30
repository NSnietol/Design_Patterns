package AbstractFactory.Products;

/**
 * Created by luisburgos on 16/07/15.
 */
public class MotorBarcoSimple implements Motor {
    @Override
    public String getShipEngineInformation() {
        return "1000 mph";
    }
}
