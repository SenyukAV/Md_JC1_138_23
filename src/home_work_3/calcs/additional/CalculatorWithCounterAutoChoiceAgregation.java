package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation implements ICalculator {
    public CalculatorWithOperator calc1;
    public CalculatorWithMathCopy calc2;
    public CalculatorWithMathExtends calc3;
    public long countOperation=0;

    // используем метод incrementCountOperation для подсчета использования функций калькулятора
    // метод принимает Object o - класс который объединяет все три класса переменных
    public long incrementCountOperation(Object o) {
      return   countOperation=countOperation+1;
    }

    //в конструкторе класса CalculatorWithCounterAutoChoiceAgregation аргумент  CalculatorWithOperator признок агригации
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calc1) {
        this.calc1 = calc1;

    }


    //в конструкторе класса CalculatorWithCounterAutoChoiceAgregation аргумент  CalculatorWithMathCopy признок агригации
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calc2) {
        this.calc2 = calc2;
    }

    //в конструкторе класса CalculatorWithCounterAutoChoiceAgregation аргумент  CalculatorWithMathExtends признок агригации
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calc3) {
        this.calc3 = calc3;
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
