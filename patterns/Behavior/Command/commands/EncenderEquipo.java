package designPatterns.patterns.Behavior.Command.commands;

import designPatterns.patterns.Behavior.Command.receiver.DispositivoElectronico;



/**

 */
public class EncenderEquipo implements Command {

    private DispositivoElectronico device;

    public EncenderEquipo(DispositivoElectronico device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }
}
