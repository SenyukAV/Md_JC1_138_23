package home_work_2_from_lecture;

import java.util.Scanner;

public class Task5 {
    public static void main(String [] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Input number for start");
        int number1=scn.nextInt();
        System.out.println("Input step");
        int number2=scn.nextInt();
        System.out.println("Input finish number ");
        int number3=scn.nextInt();
        if(!(number2<number1 && number1<number3)) {
            System.out.println("Input correct numbers");
        }
        for (int i=number1;i<=number3;i+=5){
            System.out.println(i);
        }

    }
}
