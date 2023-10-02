package arrays;

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

public class Task_2_4 {
    public static void main(String [] args) {
       System.out.println("The sum of even positive elements of the array:" +  sumOfEvenPositiveElementsArray(utils.ArraysUtils.arrayRandom(8,10)));
       System.out.println("The maximum of the array elements with even indexes:" + maximumArrayElementsWithEvenIndexes (utils.ArraysUtils.arrayRandom(8,10)));
       arrayElementsLessArithmeticMean(utils.ArraysUtils.arrayRandom(8,10));
       findTwoSmallestElementsArray(utils.ArraysUtils.arrayRandom(8,10));
       compressArrayDeletingElementsBelongingInterval(utils.ArraysUtils.arrayRandom(8,10),2,3);
       System.out.println("The sum of the digits of the array:" +  sumDigitsArray(utils.ArraysUtils.arrayRandom(8,10)));

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
    public static void arrayElementsLessArithmeticMean(int [] array) {
        int sum_up=0;
        for (int i=0;i<array.length;i++){
            sum_up=sum_up+array[0];
        }
        int average=sum_up/array.length;
        System.out.println("Array elements that are less than the arithmetic mean :");
        for (int n=0;n<array.length;n++){
            if(array[n]<average){
                System.out.println(array[n]);
            }
        }
    }

    //Найти два наименьших (минимальных) элемента массива
    public static void findTwoSmallestElementsArray(int [] array) {
        int min=array[0];
        int min2=array[0];
        for (int i=0;i<array.length;i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        System.out.println("The first smallest number is  " + min);
        for(int n=0;n<array.length;n++){
            if((min2>array[n])&&(array[n]!=min)){
                min2=array[n];
            }
        }
        System.out.println("The first smallest number is  " +min2);

    }

    //Сжать массив, удалив элементы, принадлежащие интервалу
     public static void compressArrayDeletingElementsBelongingInterval (int [] array, int n,int m) {
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

        System.out.println("Compress the array by deleting the elements belonging to the interval");
        for (int ar: array){
            System.out.println(ar);
        }
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
