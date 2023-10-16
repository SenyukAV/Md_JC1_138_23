package home_work_3.runners;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.simple.CalculatorWithCounterClassic;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {

        //по сути у нас получилось  ICalculator icalc= new CalculatorWithCounterClassic()
        // и мы передали объект интрефейса в конструктор CalculatorWithCounterAutoAgregationInterface
        CalculatorWithCounterAutoAgregationInterface clc =new CalculatorWithCounterAutoAgregationInterface (new CalculatorWithCounterClassic());

        clc.result = clc.sum(4.1, (clc.sum((clc.multiplication(15, 7)), (clc.exponentiation((clc.division(28.0, 5)), 2)))));
        System.out.println("Резульата выражения " + clc.result);
        System.out.println("Количество использования математических функций " + clc.getCountOperation());
        //

    }
}
