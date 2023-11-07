package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;


public class CalculatorWithCounterDelegateCompositeMain {
    public  static void  main (String [] args) {
        CalculatorWithCounterAutoComposite calc= new CalculatorWithCounterAutoComposite();
        calc.calc1.result =  calc.calc1.sum(4.1, ( calc.calc1.sum(( calc.calc1.multiplication(15, 7)), ( calc.calc1.exponentiation(( calc.calc1.division(28.0, 5)), 2)))));
        System.out.println("Резульата выражения " +  calc.calc1.result);
        System.out.println("Количество использования математических функций " +  calc.calc1.getCountOperation());








    }
}
