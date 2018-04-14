package designPatterns.patterns.Behavior.Command;

import designPatterns.patterns.Behavior.Command.commands.ApagarEquipo;
import designPatterns.patterns.Behavior.Command.commands.BajarVolumen;
import designPatterns.patterns.Behavior.Command.commands.EncenderEquipo;
import designPatterns.patterns.Behavior.Command.receiver.DispositivoElectronico;
import designPatterns.patterns.Behavior.Command.receiver.Television;





/**
 * Created by luisburgos on 13/08/15.
 */
public class Client {

    public static void main(String[] args) {

        DispositivoElectronico TV = new Television("SAMSUMG");

        EncenderEquipo comandoEncender = new EncenderEquipo(TV);

        BotonInvocadorHistorial botoncito;
        botoncito = new BotonInvocadorHistorial(comandoEncender);
        
        botoncito.ejecutar();

        ApagarEquipo offCommand = new ApagarEquipo(TV);
        
        botoncito.agregarComando(offCommand);
        
        botoncito.ejecutar();

        botoncito.getHistorial();
        
        
        BajarVolumen volUpCommand = new BajarVolumen(TV);
        botoncito = new BotonInvocadorHistorial(volUpCommand);
        botoncito.ejecutar();
        botoncito.ejecutar();
        botoncito.ejecutar();
        botoncito.ejecutar();

        botoncito.deshacer();
        botoncito.deshacer();

    }

}
