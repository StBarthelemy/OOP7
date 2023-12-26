import Controller.CalculatorController;
import Service.LogCalcOperatorFactory;
import Viev.CalculatorViev;
import Viev.ConsoleLogger;

public class Main {
    public static void main(String[] args) {
        LogCalcOperatorFactory factory = new LogCalcOperatorFactory(new ConsoleLogger());
        CalculatorController controller = new CalculatorController(factory, new CalculatorViev(factory));
        controller.start();
    }
}