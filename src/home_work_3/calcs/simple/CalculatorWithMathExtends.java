package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    @Override
    //Возведение в степень (возводимое число возможно дробное, степень всегда целое) используя Math
    public double exponentiation (double a,int b) {
        double res=Math.pow(a,b);
        return  res;
    }

    @Override
    //Получение модуля числа  используя Math
    public double moduleOfNumber(double a) {
        double res=Math.abs(a);
        return res;

    }
    @Override
    //Получение корня числа (возможен ввод дробных числе)  используя Math
    public double  sqrt(double a) {
        double res=Math.sqrt(a);
        return res;

    }
}
