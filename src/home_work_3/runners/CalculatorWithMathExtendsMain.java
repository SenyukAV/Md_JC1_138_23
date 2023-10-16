package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {

        public static void main(String[] args) {
            CalculatorWithMathExtends calc1 = new CalculatorWithMathExtends();
            // используем методы в нужном математическом порядке для получения результата

            calc1.result = calc1.sum(4.1, (calc1.sum((calc1.multiplication(15, 7)), (calc1.exponentiation((calc1.division(28.0, 5)), 2)))));
            System.out.println("Резульата выражения " + calc1.result);
        }
    }
