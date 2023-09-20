package home_work_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task7 {
    public static void main(String [] args){
        int [] array={1,2,3,4,5,6,7,8,9,0};
        System.out.println(createPhoneNumber(array));
    }

    public static String createPhoneNumber ( int arr []) {
        String s= "(" + String.valueOf(arr[0]) + String.valueOf(arr[1]) + String.valueOf(arr[2]) + ") "   + String.valueOf(arr[3])+ String.valueOf(arr[4]) + String.valueOf(arr[5]) + "-" + String.valueOf(arr[6]) + String.valueOf(arr[7]) +String.valueOf(arr[8]) +String.valueOf(arr[9]) + ".";
            return s;
    }


}
