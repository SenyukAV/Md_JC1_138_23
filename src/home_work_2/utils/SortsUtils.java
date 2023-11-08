package home_work_2.utils;

public class SortsUtils {


    public static int[] sort(int[] arr) {
        //showArray(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j + 1] < arr[j]) {
                    int buf= arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buf;
                }
            }
        }
        return arr;
    }

    public  static int[] shake(int[] array) {
       // showArray(array);
        boolean exchanged;
        do {
            exchanged= false;
            for (int i =0; i<=  array.length  - 2;i++) {
                if (array[ i ] > array[ i + 1 ]) {

                    int buf= array[i];
                    array[i] = array[i+1];
                    array[i+1]=buf;
                    exchanged = true;
                }
            }
            if (!exchanged) {
                break;
            }
            exchanged= false;
            for (int i= array.length - 2;i>=0;i--) {
                if (array[ i ] > array[ i + 1 ]) {
                    int buf= array[i];
                    array[i] = array[i+1];
                    array[i+1]=buf;
                    exchanged= true;
                }
            }
        } while (exchanged);
       // showArray(array);
        return array;

    }

    public static void showArray(int [] array){
        for (int i=0;i< array.length;i++){
            if(i==array.length-1) {
                System.out.print(array[i] );
                System.out.println("");
            } else { System.out.print(array[i]  + ",");}
        }
    }

    }


