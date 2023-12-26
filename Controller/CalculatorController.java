package Controller;

import Service.CalcOperatorFactory;
import Viev.CalculatorViev;

public class CalculatorController {

    private final CalcOperatorFactory factory;
    private final CalculatorViev view;


    public CalculatorController(CalcOperatorFactory factory, CalculatorViev view) {
        this.factory = factory;
        this.view = view;
    }

    public void start() {
        view.run();
    }
}