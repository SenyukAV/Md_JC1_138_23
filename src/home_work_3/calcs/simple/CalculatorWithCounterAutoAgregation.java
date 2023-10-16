package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregation implements ICalculator {
    public CalculatorWithCounterClassic calc1;

    // используем агригацию, объект CalculatorWithCounterClassic будет создан непосредсенно в main
    public CalculatorWithCounterAutoAgregation(CalculatorWithCounterClassic calc1) {
        this.calc1 = calc1;
    }

    @Override
    public double sum(double a, double b) {
        return 0;
    }

    @Override
    public double multiplication(double a, double b) {
        return 0;
    }

    @Override
    public double subtract(double a, double b) {
        return 0;
    }

    @Override
    public double division(double a, double b) {
        return 0;
    }

    @Override
    public double exponentiation(double a, int b) {
        return 0;
    }

    @Override
    public double moduleOfNumber(double a) {
        return 0;
    }

    @Override
    public double sqrt(double a) {
        return 0;
    }
}
