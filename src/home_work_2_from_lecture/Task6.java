package home_work_2_from_lecture;
/*
Переворот числа
 */

import java.util.Scanner;

public class Task6 {
    public static void main (String [] args ){
        Scanner scn =new Scanner(System.in);
        int number= scn.nextInt();
        String str_number=Integer.toString(number);
        String [] array=str_number.split("");
        String [] array_revers=new String[array.length];
        for(int i=0;i<array.length;i++){
            array_revers[i]=array[array.length-i-1];
        }
        for (int m=0;m<array_revers.length;m++){
            System.out.print(array_revers[m]);

        }

    }

}
