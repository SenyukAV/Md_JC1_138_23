package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends implements ICalculator {
    private long countOperation=0;


   public long getCountOperation() {
       return  countOperation;
   }

    //метод который считает колличесво математический действий
    public long incrementCountOperation() {
        return countOperation=countOperation+1;
    }

    @Override
    // Сумма двух числе (возможен ввод дробных числе)
    public double sum (double a,double b ){
        this.incrementCountOperation();
        return  a+b;
    }

    @Override
    //Умножение двух чисел (возможен ввод дробных числе)
    public double multiplication (double a,double b){
        this.incrementCountOperation();
       return a*b;
    }

    @Override
    //Разница двух чисел (возможен ввод дробных числе)
    public double subtract (double a,double b) {
        this.incrementCountOperation();
        return  a-b;
    }

    @Override
    //Деление двух чисел (возможен ввод дробных числе)
    public double division (double a,double b) {
        this.incrementCountOperation();
        return a/b;
    }

    @Override
    //Возведение в степень (возводимое число возможно дробное, степень всегда целое) используя Math
    public double exponentiation (double a,int b) {
        this.incrementCountOperation();
       return  Math.pow(a,b);
    }

    @Override
    //Получение модуля числа  используя Math
    public double moduleOfNumber(double a) {
        this.incrementCountOperation();
        return Math.abs(a);

    }
    @Override
    //Получение корня числа (возможен ввод дробных числе)  используя Math
    public double  sqrt(double a) {
        this.incrementCountOperation();
        return Math.sqrt(a);

    }




}
