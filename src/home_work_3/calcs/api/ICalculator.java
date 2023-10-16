package home_work_3.calcs.api;

public interface ICalculator {

     // Сумма двух числе
      double sum(double a,double b);

    //Умножение двух чисел
     double multiplication(double a,double b);

    //Разница двух чисел
     double subtract(double a,double b);

    //Деление двух чисел
     double division (double a,double b);

    //Возведение в степень
     double exponentiation (double a,int b);

    //Получение модуля числа
     double moduleOfNumber(double a);

    //Получение корня числа (возможен ввод дробных числе)
     double  sqrt(double a);



}
