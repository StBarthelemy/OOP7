package Service;

import Model.CalcOper;
import Model.Calculator;

public class CalcOperFactory implements CalcOperatorFactory {
    public CalcOper create(float arg) {
        return new Calculator(arg);
    }
}