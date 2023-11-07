package home_work_2.arrays;

/*
2.4 Задачи в презентации. На сайте есть пояснения по каждой из этих задач. Все задачи в одном классе, в отдельных методах.
 Для получения массивов вызывать ранее созданный метод arrayRandom (ArraysUtils.arrayRandom(50, 100))
		2.4.1. Сумма четных положительных элементов массива
		2.4.2. Максимальный из элементов массива с четными индексами
		2.4.3. Элементы массива, которые меньше среднего арифметического
		2.4.4. Найти два наименьших (минимальных) элемента массива
		2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
		2.4.6. Сумма цифр массива
 */

import home_work_2.utils.ArraysUtils;

public class Task_2_4 {
    public static void main(String [] args) {
    //    arrayElementsLessArithmeticMean(new int[] {1,2,3,4});
     //  System.out.println("The sum of even positive elements of the array:" +  sumOfEvenPositiveElementsArray(ArraysUtils.arrayRandom(8,10)));
     //  System.out.println("The maximum of the array elements with even indexes:" + maximumArrayElementsWithEvenIndexes (ArraysUtils.arrayRandom(8,10)));
   for (int elm :  compressArrayDeletingElementsBelongingInterval(new int[]{0,1,2,3,4,5},2,3)){
       System.out.println(elm);
        }
     //  findTwoSmallestElementsArray(ArraysUtils.arrayRandom(8,10));
      compressArrayDeletingElementsBelongingInterval(new int[]{0,1,2,3,4,5},2,3);
     //  System.out.println("The sum of the digits of the array:" +  sumDigitsArray(ArraysUtils.arrayRandom(8,10)));

    }

    //Сумма четных положительных элементов массива
    public static int sumOfEvenPositiveElementsArray(int [] array) {
        int sum=0;
        for(int i=0;i<array.length;i++){
            if((array[i]>0)&&(array[i]%2==0)){
                sum=sum+array[i];
            }
        }
        return sum;
    }

    //Максимальный из элементов массива с четными индексами
    public static int  maximumArrayElementsWithEvenIndexes(int [] array){
        int max=array[2];
        for (int i=0;i<array.length;i++){
            if((i%2==0) && (array[i]>max)) {
                max=array[i];
            }
        }
        return  max;

    }

    //Элементы массива, которые меньше среднего арифметического
    public static int[] arrayElementsLessArithmeticMean(int [] array) {
        double sum_up=0;
        int k =0;
        for (int i=0;i<array.length;i++){
            sum_up=sum_up+array[i];
        }
        double average=sum_up/array.length;

      //  System.out.println("Array elements that are less than the arithmetic mean :");
        for (int n=0;n<array.length;n++){
            if(array[n]<average){
                k=k+1;
               // System.out.println(array[n]);
            }
        }

        int [] array1= new int [k];
        k=0;
        for (int n=0;n<array.length;n++){
            if(array[n]<average){

                array1[k]=array[n];
                k++;
                // System.out.println(array[n]);
            }
        }
        return  array1;


    }

    //Найти два наименьших (минимальных) элемента массива
    public static int[] findTwoSmallestElementsArray(int [] arr) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
       int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min2
                    && arr[i] > min) {
               min2 = arr[i];
            }
        }

        int[] arrayResult = new int[]{min, min2};

        return arrayResult;
    }





    //Сжать массив, удалив элементы, принадлежащие интервалу
     public static int[] compressArrayDeletingElementsBelongingInterval (int [] array, int n,int m) {
        int k=0;
        for (int i=0;i<array.length;i++) {
            if (array[i] < n || array[i] > m) {
                array[k] = array[i];
                k++;
            }
        }
            for (int r=k;r<array.length;r++){
                array[r]=0;
            }
            return array;

    //    System.out.println("Compress the array by deleting the elements belonging to the interval");
     //   for (int ar: array){
    //        System.out.println(ar);
    //    }
    }

    //Сумма цифр массива
    public static int sumDigitsArray(int [] array){
        String str="";
        for (int i=0;i<array.length;i++){
           str=str+Integer.toString(array[i]);
        }
        char [] arrSymbl=str.toCharArray();
        int sumUp=0;
        for (int i=0;i<arrSymbl.length;i++){
            sumUp=sumUp+ Integer.parseInt(String.valueOf(i));
        }
       return  sumUp;
    }


}
