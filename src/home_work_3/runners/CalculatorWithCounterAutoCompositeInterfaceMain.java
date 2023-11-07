package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;
import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {


        ICalculator  clc =new CalculatorWithOperator();
        CalculatorWithCounterAutoAgregationInterface cl= new CalculatorWithCounterAutoAgregationInterface(clc);

         cl.result = cl.sum(4.1, (cl.sum((clc.multiplication(15, 7)), (cl.exponentiation((cl.division(28.0, 5)), 2)))));
       System.out.println("Резульата выражения " + cl.result);
        System.out.println("Количество использования математических функций " + cl.getCountOperation());
        //

    }
}
