package AbstractFactory.Products;

/**
 * Created by luisburgos on 16/07/15.
 */
public class MotorBarcoJefe implements Motor {
    @Override
    public String getShipEngineInformation() {
        return "5000 mph";
    }
}
