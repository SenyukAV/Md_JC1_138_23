package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {


        // для использования в конструкторе класса CalculatorWithCounterAutoChoiceAgregation
        CalculatorWithOperator calc1 =new CalculatorWithOperator();
        CalculatorWithMathCopy calc2 = new CalculatorWithMathCopy();
        CalculatorWithMathExtends calc3=new CalculatorWithMathExtends();

        CalculatorWithCounterAutoChoiceAgregation clc1=new CalculatorWithCounterAutoChoiceAgregation(calc1);
        CalculatorWithCounterAutoChoiceAgregation clc2=new CalculatorWithCounterAutoChoiceAgregation(calc2);
        CalculatorWithCounterAutoChoiceAgregation clc3=new CalculatorWithCounterAutoChoiceAgregation(calc3);


        // используем  метод incrementCountOperation  для    подсчета использования функций калькулятора с использованием класса CalculatorWithOperator
        clc1.countOperation=clc1.incrementCountOperation(clc1.calc1.sum(4.1, ( clc1.incrementCountOperation(clc1.calc1.sum(( clc1.incrementCountOperation(clc1.calc1.multiplication(15, 7))), ( clc1.incrementCountOperation (clc1.calc1.exponentiation(( clc1.incrementCountOperation( clc1.calc1.division(28.0, 5))), 2))))))));
        System.out.println("Резульата подсчета использования функций калькулятора с использованием класса CalculatorWithOperator - " +    clc1.countOperation);

        //Резульата выражения с использованием класса CalculatorWithOperator
        clc1.calc1.result = clc1.calc1.sum(4.1, ( clc1.calc1.sum(( clc1.calc1.multiplication(15, 7)), (  clc1.calc1.exponentiation((  clc1.calc1.division(28.0, 5)), 2)))));
        System.out.println("Резульата выражения с использованием класса CalculatorWithOperator-  " +   clc1.calc1.result);


        // используем  метод incrementCountOperation  для    подсчета использования функций калькулятора с использованием класса CalculatorWithMathCopy
        clc2.countOperation=clc2.incrementCountOperation(clc2.calc2.sum(4.1, ( clc2.incrementCountOperation(clc2.calc2.sum(( clc2.incrementCountOperation(clc2.calc2.multiplication(15, 7))), ( clc2.incrementCountOperation (clc2.calc2.exponentiation(( clc2.incrementCountOperation( clc2.calc2.division(28.0, 5))), 2))))))));
        System.out.println("Резульата подсчета использования функций калькулятора с использованием класса CalculatorWithMathCopy - " +    clc2.countOperation);

        //Резульата выражения с использованием класса CalculatorWithMathCopy
        clc2.calc2.result = clc2.calc2.sum(4.1, ( clc2.calc2.sum(( clc2.calc2.multiplication(15, 7)), (  clc2.calc2.exponentiation((  clc2.calc2.division(28.0, 5)), 2)))));
        System.out.println("Резульата выражения с использованием класса CalculatorWithMathCopy-  " +   clc2.calc2.result);

        // используем  метод incrementCountOperation  для    подсчета использования функций калькулятора с использованием класса CalculatorWithMathExtends
        clc3.countOperation=clc3.incrementCountOperation(clc3.calc3.sum(4.1, ( clc3.incrementCountOperation(clc3.calc3.sum(( clc3.incrementCountOperation(clc3.calc3.multiplication(15, 7))), ( clc3.incrementCountOperation (clc3.calc3.exponentiation(( clc3.incrementCountOperation( clc3.calc3.division(28.0, 5))), 2))))))));
        System.out.println("Резульата подсчета использования функций калькулятора с использованием класса CalculatorWithMathExtends - " +    clc3.countOperation);

        //Резульата выражения с использованием класса CalculatorWithMathExtends
        clc3.calc3.result = clc3.calc3.sum(4.1, ( clc3.calc3.sum(( clc3.calc3.multiplication(15, 7)), (  clc3.calc3.exponentiation((  clc3.calc3.division(28.0, 5)), 2)))));
        System.out.println("Резульата выражения  с использованием класса CalculatorWithMathExtends -  " +   clc2.calc2.result);






    }
}
