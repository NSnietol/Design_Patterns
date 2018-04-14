package designPatterns.patterns.Behavior.Command.commands;

import designPatterns.patterns.Behavior.Command.receiver.DispositivoElectronico;




/**
 * Created by luisburgos on 13/08/15.
 */
public class SubirVolumen implements Command {

    private final DispositivoElectronico device;

    public SubirVolumen(DispositivoElectronico device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumenDown();
    }

    @Override
    public void undo() {
        device.volumeUp();
    }


}
