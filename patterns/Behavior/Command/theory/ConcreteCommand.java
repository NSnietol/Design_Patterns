package designPatterns.patterns.Behavior.Command.theory;

/**
 * Created by luisburgos on 13/08/15.
 */
public class ConcreteCommand extends Command {

    private Receiver receiver;

    @Override
    public void execute(Receiver receiver) {
      
        this.receiver = receiver;
          receiver.doAction();
    }

}
