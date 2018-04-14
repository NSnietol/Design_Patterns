package designPatterns.patterns.Behavior.Command.receiver;

public abstract class DispositivoElectronico {

    protected int volume = 0;
    protected String name;
    protected boolean isOn;

    public abstract void on();

    public abstract void off();

    public abstract void volumeUp();

    public abstract void volumenDown();
}
