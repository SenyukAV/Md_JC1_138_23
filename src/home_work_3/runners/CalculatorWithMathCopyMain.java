package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String [] args) {
        CalculatorWithMathCopy calc1= new CalculatorWithMathCopy();
        // используем методы в нужном математическом порядке для получения результата

        calc1.result =calc1.sum( 4.1 , (calc1.sum((calc1.multiplication(15,7)),( calc1.exponentiation((calc1.division(28.0 ,5)),2)))));
        System.out.println("Резульата выражения "+calc1.result);
    }
}
