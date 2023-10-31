package home_work_2;

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
    public static void main(String [] args) {
        findLargestDigitOfNaturalNumber();
        probabilityOfRandomEvenNumbers();
        CountEvenAndOddDigitsOfNumber();
        fibonacciSequence();
        PrintSeriesOfNumbersInRangeInIncrements();
        NumberReversal();

    }

    //Найти наибольшую цифру натурального числа
    public static void findLargestDigitOfNaturalNumber(){
        System.out.println("Enter a natural number");
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
        System.out.println("The largest digit of a natural number is "+max);
    }

    //Вероятность четных случайных чисел

    public static void CountEvenAndOddDigitsOfNumber(){
        Scanner scn = new Scanner(System.in);
        int number=scn.nextInt();
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
        System.out.println("The numbers of even digits = "+even);
        System.out.println("The numbers of odd digits = "+odd);
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
    public static void fibonacciSequence() {
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0+" "+n1+" ");
        for(int i = 3; i <= 11; i++){
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }
        System.out.println();
    }

    //Вывести ряд чисел в диапазоне с шагом
    public static void PrintSeriesOfNumbersInRangeInIncrements(){
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
        for (int i=number1;i<=number3;i+=number2){
            System.out.print(i + " ");
        }
    }

    //Переворот числа
    public static void NumberReversal(){
        System.out.println("Input number ");
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







