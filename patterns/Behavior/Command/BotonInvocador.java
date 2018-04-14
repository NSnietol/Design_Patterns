package designPatterns.patterns.Behavior.Command;

import designPatterns.patterns.Behavior.Command.commands.Command;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ns
 */
public class BotonInvocador {
    
    private final Command command;

    public BotonInvocador(Command command) {
        this.command= command;
    }
    
     public void ejecutar() {
        command.execute();

    }

    public void deshacer() {
        command.undo();
    }
    
    
    
}
