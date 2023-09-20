package home_work_1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Input integer number :");
        int num1 = scn.nextInt();
        System.out.println("Input integer number :");
        int num2 = scn.nextInt();
        System.out.println("Input integer number :");
        int num3 = scn.nextInt();
        System.out.println("Input  double number :");
        double num4 = scn.nextDouble();
        System.out.println("Input symbol :");
        char chr5=scn.next().charAt(0);
        System.out.println("Input year :");
        int num5 = scn.nextInt();

        oddOrEven(num1);
        findMiddleNumber(num1, num2, num3);
        divisibilityOfNumber(num1, num2);
        convecotrByteToKbyte(num4);
        convecotrKbyteTobyte(num4);
        defineSymbol(chr5);
        definitionOfLeapYear(num5);



    }

    public static void oddOrEven(int a) {
        if (a % 2 == 0) {
            System.out.println("Number " + a + " is even");
        } else {
            System.out.println("Number is odd");
        }


    }

    public static void findMiddleNumber(int a, int b, int c) {
        if ((b > a) && (b < c)) {
            System.out.println("Nubner " + b + " is midlle number");
        } else if ((c > a) && (c < b)) {
            System.out.println("Nubner " + c + " is midlle number");
        } else if ((a > b) && (a < c)) {
            System.out.println("Nubner " + a + " is midlle number");
        } else {
            System.out.println("The problem with determining the necessary condition with the middle number");
            ;
        }

    }

    public static void divisibilityOfNumber(int a, int b) {
        if (a % b == 0) {
            System.out.println("The divisibility of  numbers " + a + " and " + b + " exists");
        } else {
            System.out.println("The divisibility of  numbers " + a + " and " + b + " don't exists");
        }
    }

    public static void convecotrKbyteTobyte(double a) {
        if (a > 0) {
            double result = a * 1024.0;
            System.out.println(a + " Kbyty = " + result + " byte");
        } else {
            System.out.println("Incorrect parameter");
        }

    }

    public static void convecotrByteToKbyte(double a) {
        if (a > 0) {
            double result = a / 1024;
            System.out.println(a + " byty = " + result + " Kbyte");
        } else {
            System.out.println("Incorrect parameter");
        }

    }

    public static  void  defineSymbol(char chr){
        boolean result=Character.isAlphabetic(chr);
        if (result) {
            System.out.println("Symbol " + chr + " is alphabetic ");
        } else  {
            System.out.println("Symbol " + chr + " is not alphabetic ");
        }
    }

    public static void  definitionOfLeapYear(int a){
        if (a>1584) {
            if ((a%400==0) || ((a%4==0)&&(a%100!=0))) {
                System.out.println("The year" + a + " is leap year");
            }
            else {
                System.out.println("The year is  not leap year");
            }

        } else {
            System.out.println("The year before the leap year was created");
        }
    }

}



