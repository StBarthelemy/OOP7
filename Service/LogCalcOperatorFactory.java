package Service;

import Model.CalcOper;
import Model.Calculator;
import Model.LogCalculator;
import Viev.Loggable;

public class LogCalcOperatorFactory implements CalcOperatorFactory{
    private Loggable logger;

    public LogCalcOperatorFactory(Loggable logger){
        this.logger = logger;
    }
    @Override
    public CalcOper create(float arg) {
        return new LogCalculator(new Calculator(arg), logger);
    }
}