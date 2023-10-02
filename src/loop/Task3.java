package loop;

/*

Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число которое мы будем возводить,
Второе число это степень в которую возводят первое число. Степень - только положительная и целая.
 Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
		1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
		1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String [] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("The number that will be squared ");
        String number1=scn.nextLine();
        System.out.println("The square of the number");
        String number2=scn.nextLine();
        squared(number1,number2);
    }

    public static void squared(String number1,String number2) {
        //выполянем проверки, что введеные числа соответвуют условию используя методы для проверки
        if (!(check1(number1))) {
            System.out.println("The number that will be squared is incorrect");
        } else if (!(check2(number2))) {
            System.out.println("The square of the number is incorrect");
        } else {
            double squaredFinal = Double.parseDouble(number1);
            for (int i = 0; i < Integer.parseInt(number2) - 1; i++) {
                squaredFinal = squaredFinal * Double.parseDouble(number1);
            }
            System.out.println("Result is "+squaredFinal);
        }
    }

    //проверяем, что значение которое возводят в степень число которое может быть дробным
    public static boolean check1(String number1) {
        boolean result=false;
        char [] array1=number1.toCharArray();
        for (char num: array1) {
            if((Character.isDigit(num))||(num == '.')) {
                 result =true;
            } else {
                result=false;
                break;
            }
        }
        return  result;
    }
    //проверяем, что значение степени  положительное и целое
    public static boolean check2(String number2) {
        boolean result2=false;
        char [] array2=number2.toCharArray();
        for (char num2: array2)
            if((Character.isDigit(num2))&&(Character.getNumericValue(num2)>=0)) {
                result2 =true;
            } else {
                result2=false;
                break;
            }
        return  result2;
    }
}
