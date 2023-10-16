package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calc1= new  CalculatorWithCounterAutoSuper();
        calc1.result = calc1.sum(4.1, (calc1.sum((calc1.multiplication(15, 7)), (calc1.exponentiation((calc1.division(28.0, 5)), 2)))));
        System.out.println("Резульата выражения " + calc1.result);
        System.out.println("Количество использования математических функций " + calc1.getCountOperation());

    }
}
