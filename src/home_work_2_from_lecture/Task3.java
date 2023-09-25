package home_work_2_from_lecture;

/*
Посчитать четные и нечетные числа
 */

import java.util.Scanner;

public class Task3 {
    public static void main (String [] args) {
        Scanner scn = new Scanner(System.in);
        int number=scn.nextInt();
        String number_string=Integer.toString(number);
        String[] array  =number_string.split("");
        //int max=Integer.parseInt(array[0]);
        int even=0;
        int odd=0;
        for(int i=0;i<array.length;i++) {
            if(Integer.parseInt(array[i]) %2==0){
                even++;
            } else {
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
