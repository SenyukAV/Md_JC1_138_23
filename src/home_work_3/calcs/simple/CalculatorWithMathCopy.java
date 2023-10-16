package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    public double result;

    // Сумма двух числе (возможен ввод дробных числе)
    public double sum (double a,double b ){
        return  a+b;
    }

    //Умножение двух чисел (возможен ввод дробных числе)
    public double multiplication (double a,double b){
        return a*b;
    }

    //Разница двух чисел (возможен ввод дробных числе)
    public double subtract (double a,double b) {
        return  a-b;
    }

    //Деление двух чисел (возможен ввод дробных числе)
    public double division (double a,double b) {
        return a/b;
    }

    //Возведение в степень (возводимое число возможно дробное, степень всегда целое) используя Math
    public double exponentiation (double a,int b) {
        return  Math.pow(a,b);
    }

    //Получение модуля числа  используя Math
    public double moduleOfNumber(double a) {
        return Math.abs(a);

    }

    //Получение корня числа (возможен ввод дробных числе)  используя Math
    public double  sqrt(double a) {
        return Math.sqrt(a);

    }
}
