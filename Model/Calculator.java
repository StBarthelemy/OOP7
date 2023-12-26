package Model;

public class Calculator implements CalcOper {
    private float arg;

    public Calculator(float arg) {
        this.arg = arg;
    }

    @Override
    public CalcOper sum(float arg) {
        this.arg += arg;
        return this;
    }

    @Override
    public CalcOper multi(float arg) {
        this.arg *= arg;
        return this;
    }

    @Override
    public CalcOper div(float arg) {
        this.arg /= arg;
        return this;
    }

    @Override
    public float getResult() {
        return arg;
    }
}