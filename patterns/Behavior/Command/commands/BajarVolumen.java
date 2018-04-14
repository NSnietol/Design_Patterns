package designPatterns.patterns.Behavior.Command.commands;

import designPatterns.patterns.Behavior.Command.receiver.DispositivoElectronico;




public class BajarVolumen implements Command {

    private final DispositivoElectronico device;

    public BajarVolumen(DispositivoElectronico device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }

    @Override
    public void undo() {
        device.volumenDown();
    }


}
