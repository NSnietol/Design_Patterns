package designPatterns.patterns.Behavior.Command.receiver;

/**
 * Created by luisburgos on 13/08/15.
 */
public class Television extends DispositivoElectronico {

    public Television(String name) {
        this.name = name;
    }

    @Override
    public void on() {
        System.out.println(name + " TV encendida");
    }

    @Override
    public void off() {
        System.out.println(name + " TV apagada");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println(name + " TV Volumen : " + volume);
    }

    @Override
    public void volumenDown() {
        volume--;
        System.out.println(name + " TV Volumen: " + volume);
    }

}
