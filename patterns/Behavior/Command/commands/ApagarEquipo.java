package designPatterns.patterns.Behavior.Command.commands;

import designPatterns.patterns.Behavior.Command.receiver.DispositivoElectronico;

/**
 * @author ns
 */
public class ApagarEquipo implements Command {

    private final DispositivoElectronico device;

    public ApagarEquipo(DispositivoElectronico device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }

    @Override
    public void undo() {
        device.on();
    }
}
