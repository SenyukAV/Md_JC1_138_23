package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithCounterClassic;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main (String [] args) {
        CalculatorWithCounterClassic clc1= new CalculatorWithCounterClassic();
        CalculatorWithCounterAutoAgregation calc2= new CalculatorWithCounterAutoAgregation(clc1);
        calc2.calc1.result =  calc2.calc1.sum(4.1, ( calc2.calc1.sum(( calc2.calc1.multiplication(15, 7)), ( calc2.calc1.exponentiation(( calc2.calc1.division(28.0, 5)), 2)))));
        System.out.println("Резульата выражения " +  calc2.calc1.result);
        System.out.println("Количество использования математических функций " +  calc2.calc1.getCountOperation());
    }
}
