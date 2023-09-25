package home_work_2_from_lecture;

/*
Найти найти наибольшую цифру натурального числа
*/

import java.util.Scanner;

public class Task1 {
    public static void main (String [] args) {
        Scanner scn = new Scanner(System.in);
        int number=scn.nextInt();
        String number_string=Integer.toString(number);
        String[] array  =number_string.split("");
        int max=Integer.parseInt(array[0]);
        for(int i=0;i<array.length;i++) {
            if(max<Integer.parseInt(array[i])){
                max=Integer.parseInt(array[i]);
            }
        }
        System.out.println(max);

    }


}
