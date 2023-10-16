package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
   public double result;

    // Сумма двух числе (возможен ввод дробных числе)
    public double sum (double a,double b ){
        double res=a+b;
        return res;
    }

    //Умножение двух чисел (возможен ввод дробных числе)
   public double multiplication (double a,double b){
        double res=a*b;

        return res;
    }

    //Разница двух чисел (возможен ввод дробных числе)
    public double subtract (double a,double b) {
        double res=a-b;

        return  res;
    }

    //Деление двух чисел (возможен ввод дробных числе)
    public double division (double a,double b) {
        double res=a/b;

        return res;
    }

    //Возведение в степень (возводимое число возможно дробное, степень всегда целое)
    public double exponentiation (double a,int b) {
        double res=1;
        for (int i=1;i<=b;i++){
            res=res*a;
        }

        return  res;
    }

    //Получение модуля числа
     public double moduleOfNumber(double a) {
                 return (a <= 0.0D) ? 0.0D - a : a;

    }

    //Получение корня числа (возможен ввод дробных числе)
   public double  sqrt(double a) {
        double res=sqrt(a);
        return res;

    }







}
