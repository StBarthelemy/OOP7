package Model;

public interface CalcOper {
    CalcOper sum(float arg);
    CalcOper multi(float arg);
    CalcOper div(float arg);
    float getResult();
}