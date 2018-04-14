package designPatterns.patterns.Behavior.Command.theory;

/**

 */
public class Invoker {
    
    
    public void executeCommand(Command command, Receiver receiver){
        command.execute(receiver);
    }
}
