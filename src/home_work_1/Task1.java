package home_work_1;

import java.util.Scanner;

import static java.lang.Integer.*;

public class Task1 {
    public static void main(String [] args) {
       /**
        Scanner scn= new Scanner(System.in);
        int number1 =scn.nextInt();
        int number2 =scn.nextInt();
        System.out.println(toBinaryString(number1));
        System.out.println(toBinaryString(number2));
        int result1=number1^number2;
        int result2=number1&number2;
        System.out.println(result1);
        System.out.println(result2);
        **/

        //первое число
        int numberOne=5;

        //второе число
        int numberTwo=7;

        //Побитовое XOR  первого и второго числа
        System.out.println(toBinaryXor(numberOne , numberTwo));

        //Побитовое AND  первого и второго числа
        System.out.println(toBinaryAnd(numberOne , numberTwo));




    }

    //Побитовое XOR
    public  static int  toBinaryXor(int a , int b) {
        return a^b;
    }

    //Побитовое AND
    public  static int  toBinaryAnd(int a , int b) {
        return a&b;
    }

}
