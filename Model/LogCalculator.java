package Model;

import Viev.Loggable;

public class LogCalculator implements CalcOper {
    private CalcOper calculator;
    private Loggable logger;

    public LogCalculator(CalcOper calculator, Loggable logger){
        this.calculator = calculator;
        this.logger = logger;
    }

    @Override
    public CalcOper sum(float arg) {
        float firstArg = calculator.getResult();
        logger.log(String.format("Первое значение калькулятора %f. Начало вызова метода sum с параметром %f", firstArg, arg));
        CalcOper result = calculator.sum(arg);
        logger.log(String.format("Вызова метода sum произошел"));
        return result;
    }

    @Override
    public CalcOper multi(float arg) {
        float firstArg = calculator.getResult();
        logger.log(String.format("Первое значение калькулятора %f. Начало вызова метода multi с параметром %f", firstArg, arg));
        CalcOper result = calculator.multi(arg);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    @Override
    public CalcOper div(float arg) {
        float firstArg = calculator.getResult();
        logger.log(String.format("Первое значение калькулятора %f. Начало вызова метода div с параметром %f", firstArg, arg));
        CalcOper result = calculator.div(arg);
        logger.log(String.format("Вызова метода div произошел"));
        return result;
    }

    @Override
    public float getResult() {
        float result = calculator.getResult();
        logger.log(String.format("Получение результата %f", result));
        return result;
    }
}