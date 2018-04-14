package designPatterns.patterns.Behavior.Command.receiver;

public class Radio  extends DispositivoElectronico {

  
    public Radio(String name) {
        this.name = name;
    }

    @Override
    public void on() {
        this.isOn=true;
        System.out.println(name + " RADIO encendido");
    }

    @Override
    public void off() {
        this.isOn=false;
        System.out.println(name + " RADIO apagado");
    }

    @Override
    public void volumeUp() {
        this.volume++;
        System.out.println(name + " RADIO Volumen : " + volume);
    }

    @Override
    public void volumenDown() {
        this.volume--;
        System.out.println(name + " RADIO Volumen: " + volume);
    }
}
