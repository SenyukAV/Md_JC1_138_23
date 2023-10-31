package arrays;

/*
2.2 Создать класс ArraysIteration. В этом классе написать перебор (итерирование) массива при помощи do....while, while, for, foreach. Вызывая ранее созданный метод
 arrayFromConsole (ArraysUtils.arrayFromConsole()) получить массив. Все задачи в одном классе, в отдельных методах, в каждом методе используется 4 разных цикла.
Должно получиться 3 метода:
		2.2.1. Вывести все элементы в консоль.
		2.2.2. Вывести каждый второй элемент массива в консоль.
		2.2.3. Вывести все элементы массива в консоль в обратном порядке.
 */


import home_work_2.utils.ArraysUtils;

public class ArraysIteration {

    public static void main(String[] args) {
        arrayIteration1(ArraysUtils.arrayFromConsole());
        arrayIteration2(ArraysUtils.arrayFromConsole());
        arrayIteration3(ArraysUtils.arrayFromConsole());


    }
    //Вывести все элементы в консоль.
    public static void arrayIteration1(int[] array) {
        int n = 0;
        do {
            System.out.println(array[n]);
            n++;
        } while (n < array.length);
        System.out.println("-----------");
        int m = 0;
        while (m < array.length) {
            System.out.println(array[m]);
            m++;
        }
        System.out.println("-----------");
        for (int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }
        System.out.println("-----------");
        for (int arrayElemant : array) {
            System.out.println(arrayElemant);
        }
        System.out.println("-----------");

    }

    //Вывести каждый второй элемент массива в консоль.
    public static void arrayIteration2(int[] array) {
        int n = 0;
        do {
            if (n % 2 == 0) {
                System.out.println(array[n]);
            }
            n++;
        } while (n < array.length);
        System.out.println("-----------");
        int m = 0;
        while (m < array.length) {
            if (m % 2 == 0) {
                System.out.println(array[m]);
            }
            m++;
        }
        System.out.println("-----------");
        for (int k = 0; k < array.length; k++) {
            if (k % 2 == 0) {
                System.out.println(array[k]);
            }
        }
        System.out.println("-----------");
        int f = 0;
        for (int arrayElemant : array) {
            if (f % 2 == 0) {
                System.out.println(arrayElemant);
            }
            f++;
        }
        System.out.println("-----------");

    }

    //Вывести все элементы массива в консоль в обратном порядке.
    public static void arrayIteration3(int[] array) {
        int n = array.length-1;
        do {
            System.out.println(array[n]);
            n--;
        } while (n >= 0);
        System.out.println("-----------");
        int m = array.length-1;
        while (m >= 0) {
            System.out.println(array[m]);
            m--;
        }
        System.out.println("-----------");
        for (int k = array.length-1; k >=0; k--) {
            System.out.println(array[k]);
        }
        System.out.println("-----------");



        for (int arrayElemant : array) {
            System.out.println("Без коллекции, стрима не знаю как  вывести все элементы массива в консоль в обратном порядке для foreach. ");
        }
        System.out.println("-----------");

    }
}