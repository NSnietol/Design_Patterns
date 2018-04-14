package designPatterns.patterns.Behavior.Command.theory;

/**
 * Created by luisburgos on 13/08/15.
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver();

        invoker.executeCommand(new ConcreteCommand(), receiver);
    }

}
