package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends implements ICalculator {

    //обращения к элементам супер класса через super

    public double result;
    private long countOperation=0;

    public long getCountOperation() {
        return  countOperation;
    }

    public void incrementCountOperation() {
        countOperation=countOperation+1;
    }

    @Override
    // Сумма двух числе (возможен ввод дробных числе)
    //Сохраняем как было у суперкласа CalculatorWithOperator и добавялем  подсчет
    public double sum (double a,double b ){
        this.incrementCountOperation();
        return  super.sum( a, b);
    }

    @Override
    //Умножение двух чисел (возможен ввод дробных числе)
    //Сохраняем как было у суперкласа CalculatorWithOperator и добавялем  подсчет
    public double multiplication (double a,double b){
        this.incrementCountOperation();
        return  super.multiplication(a,b);
    }
    @Override
    //Разница двух чисел (возможен ввод дробных числе)
    //Сохраняем как было у суперкласа CalculatorWithOperator и добавялем  подсчет
    public double subtract (double a,double b) {
        this.incrementCountOperation();
        return  super.subtract(a,b);
    }

    @Override
    //Деление двух чисел (возможен ввод дробных числе)
    //Сохраняем как было у суперкласа CalculatorWithOperator и добавялем  подсчет
    public double division (double a,double b) {
        this.incrementCountOperation();
        return  super.division(a,b);
    }

    @Override
    //Возведение в степень (возводимое число возможно дробное, степень всегда целое)
    //Сохраняем как было у суперкласа CalculatorWithOperator и добавялем  подсчет
    public double exponentiation (double a,int b) {
        this.incrementCountOperation();
        return  super.exponentiation(a,b);
    }

    @Override
    //Получение модуля числа
    //Сохраняем как было у суперкласа CalculatorWithOperator и добавялем  подсчет
    public double moduleOfNumber(double a) {

        this.incrementCountOperation();
        return  super.moduleOfNumber(a);
    }

    @Override
    //Получение корня числа (возможен ввод дробных числе)
    //Сохраняем как было у суперкласа CalculatorWithOperator и добавялем  подсчет
    public double  sqrt(double a) {

        this.incrementCountOperation();
        return super.sqrt(a);

    }

    }





