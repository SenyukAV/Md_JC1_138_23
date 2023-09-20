package home_work_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String [] args) {
        Scanner scn= new Scanner(System.in);
        int number1 =scn.nextInt();
        int number2 =scn.nextInt();
        System.out.println(Integer.toBinaryString(number1));
        System.out.println(Integer.toBinaryString(number2));
        int result1=number1^number2;
        int result2=number1&number2;
        System.out.println(result1);
        System.out.println(result2);


    }
}
