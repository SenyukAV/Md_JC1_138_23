package home_work_2.loop;

/*
  1.5. Задачи в презентации. На сайте есть пояснения по каждой из этих задач. Все задачи в одном классе, в отдельных методах.
    	1.5.1. Найти наибольшую цифру натурального числа
    	1.5.2. Вероятность четных случайных чисел
    	1.5.3. Посчитать четные и нечетные цифры числа
    	1.5.4. Ряд Фибоначчи
    	1.5.5. Вывести ряд чисел в диапазоне с шагом
    	1.5.6. Переворот числа
 */

import java.util.Scanner;

public class Task5 {

  /**
    public static void main(String [] args) {
      //  System.out.println(  PrintSeriesOfNumbersInRangeInIncrements(1,2,5));
      // System.out.println( findLargestDigitOfNaturalNumber(456789));
        //probabilityOfRandomEvenNumbers();
     //   System.out.println(CountEvenAndOddDigitsOfNumber(12345678));
      //  System.out.println(fibonacciSequence(5));
        //PrintSeriesOfNumbersInRangeInIncrements();
        System.out.println( NumberReversal(23456));

    }
  **/

    //Найти наибольшую цифру натурального числа
    public static int findLargestDigitOfNaturalNumber(int a){
        //System.out.println("Enter a natural number");
       // Scanner scn = new Scanner(System.in);
       // int number=scn.nextInt();
        int number=a;
        String number_string=Integer.toString(number);
        String[] array  =number_string.split("");
        int max=Integer.parseInt(array[0]);
        for(int i=0;i<array.length;i++) {
            if(max<Integer.parseInt(array[i])){
                max=Integer.parseInt(array[i]);
            }
        }
        return max;
        //System.out.println("The largest digit of a natural number is "+max);
    }

    //Вероятность четных случайных чисел

    public static int CountEvenAndOddDigitsOfNumber(int a){
      //  Scanner scn = new Scanner(System.in);
     //   int number=scn.nextInt();
        int number=a;
        String number_string=Integer.toString(number);
        String[] array  =number_string.split("");
        int even=0;
        int odd=0;
        for(int i=0;i<array.length;i++) {
            if(Integer.parseInt(array[i]) %2==0){
                even++;
            } else {
                odd++;
            }
        }
        return even;
      //  System.out.println("The numbers of even digits = "+even);
    //    System.out.println("The numbers of odd digits = "+odd);
    }

    //Посчитать четные и нечетные цифры числа, если создавать ряд рандомных цифр
    public static void probabilityOfRandomEvenNumbers() {
        int even=0;
        int odd=0;
        int number=0;
        for (int i =0;i<1000;i++){
            number=(int) (Math.random()*(1000)) + 0;
            if(number%2==0){
                odd++;
            } else {
                even++;
            }
        }
        System.out.println("We have even  "+even);
        System.out.println("We have odd "+odd);
        if(even>odd){
            System.out.println("We have more even this time");
        } else if(even<odd) {
            System.out.println("We have more odd this time");
        } else  {
            System.out.println("Equale even and odd");
        }
    }

    //Ряд Фибоначчи
    public static String fibonacciSequence(int n) {
        String result="1 1";
        int n0 = 1;
        int n1 = 1;
        int n2;
      //  System.out.print(n0+" "+n1+" ");
        for(int i = 3; i <= n; i++){
            n2=n0+n1;
        //    System.out.print(n2+" ");
            result=result+" " +n2;
            n0=n1;
            n1=n2;
        }
        return  result;
       // System.out.println();
    }

    //Вывести ряд чисел в диапазоне с шагом
    public static String PrintSeriesOfNumbersInRangeInIncrements(int a,int b,int c){
      //  Scanner scn=new Scanner(System.in);
      //  System.out.println("Input number for start");
        String result="";
        int number1=a;
        int number2=b;
        int number3=c;
      //  int number1=scn.nextInt();
      //  System.out.println("Input step");
     //   int number2=scn.nextInt();
     //   System.out.println("Input finish number ");
     //   int number3=scn.nextInt();
 //       if(!(number2<number1 && number1<number3)) {
 //           System.out.println("Input correct numbers");
 //       }
        for (int i=number1;i<=number3;i+=number2){
            //System.out.print(i + " ");
            result=result+i + " ";
        }
        return  result;
    }

    //Переворот числа
    public static String NumberReversal(int a){
       // System.out.println("Input number ");
       // Scanner scn =new Scanner(System.in);
       // int number= scn.nextInt();
        String result="";
        int number=a;
        String str_number=Integer.toString(number);
        String [] array=str_number.split("");
        String [] array_revers=new String[array.length];
        for(int i=0;i<array.length;i++){
            array_revers[i]=array[array.length-i-1];
        }
        for (int m=0;m<array_revers.length;m++){
           result+=array_revers[m];
        }
        return  result;
    }


}







