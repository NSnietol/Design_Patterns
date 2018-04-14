package designPatterns.patterns.Behavior.Command;


import designPatterns.patterns.Behavior.Command.commands.Command;
import java.util.ArrayList;



/**
 *@author ns
 */
public class BotonInvocadorHistorial {

    private int posicion;
    // private final Command command;
    private final ArrayList<Command> commands;

    // Una forma de realizar la gestión del historial de ordenes es crear un arraylist
    public BotonInvocadorHistorial(Command command) {
        commands = new ArrayList<>();

        commands.add(command);
        posicion = 0;
    }

    public boolean agregarComando(Command nuevo) {
        posicion++;
        // Existe un pequeño inconveniente con esto, porque si falla el método .add ya se habrá aumentado posicion
        return commands.add(nuevo);
    }

    public boolean avanzar() {
        if (commands.size() - 1 > posicion) {

            posicion++;
            return true;
        }

        return false;
    }

    public boolean retroceder() {
        if (posicion > 1) {

            posicion--;
            return true;
        }

        return false;
    }

    public void ejecutar() {
        commands.get(posicion).execute();

    }

    public void deshacer() {
        commands.get(posicion).undo();
    }
    
    public void getHistorial(){
   
        System.out.println("----------------Comandos----------------");
    
        commands.forEach((command) -> {
            System.out.println(command.getClass().getSimpleName());
        });
        System.out.println("----------------------------------------\n");
    }
    
    
    
}
