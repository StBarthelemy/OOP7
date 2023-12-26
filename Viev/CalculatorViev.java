package Viev;

import Model.CalcOper;
import Service.CalcOperatorFactory;

import java.util.Scanner;

public class CalculatorViev implements iCalculatorViev {
    private final CalcOperatorFactory calcOperatorFactory;

    public CalculatorViev(CalcOperatorFactory calcOperatorFactory) {
        this.calcOperatorFactory = calcOperatorFactory;
    }

    @Override
    public void run() {
        while (true) {
            float argument = promptFloat("Введите первое число: ");
            CalcOper calculator = calcOperatorFactory.create(argument);
            while (true) {
                String cmd = prompt("Введите оператор (+, *, /, =) : ");
                if (cmd.equals("+")) {
                    float arg = promptFloat("Введите второе число: ");
                    calculator.sum(arg);
                }
                if (cmd.equals("*")) {
                    float arg = promptFloat("Введите второе число: ");
                    calculator.multi(arg);
                }
                if (cmd.equals("/")) {
                    float arg = promptFloat(("Введите второе число: "));
                    while (arg == 0) {
                        System.out.println("Нельзя делить на ноль");
                        arg = promptFloat(("Введите второе число: "));
                    }
                    calculator.div(arg);
                }
                if (cmd.equals("=")) {
                    float result = calculator.getResult();
                    System.out.printf("Результат %f\n", result);
                    break;
                }
            }
            String cmd = prompt("Продолжить (+/-)?");
            if (cmd.equalsIgnoreCase("+")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private float promptFloat(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Float.parseFloat(in.nextLine());
    }
}