package utils;

/*
2.1. Создать класс ArraysUtils. В этом классе не должно быть main метода. В этом классе написать следующие методы:
		2.1.1. Написать метод public static int[] arrayFromConsole(). Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.
			2.1.1.1. Пример в отдельном классе с main. int[] container = arrayFromConsole(). Результат: В методе arrayFromConsole будет запрошена информация у пользователя,
 пользователь вводит размер (3) и его элементы по порядку {4, 17, 32}. Соответсвенно будет создан массив размером 3 с элементами {4, 17, 32} и сохранён в переменную container.
		2.1.2. Написать метод public static int[] arrayRandom(int size, int maxValueExclusion). Данный метод принимает два аргумента. Первый (size) указывает размер массива
 который мы хотим получить. Второй (maxValueExclusion) указывает до какого числа генерировать рандомные числа.
 */


import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    public static int[] arrayFromConsole() {

        Scanner scn = new Scanner(System.in);
        System.out.println("Input size of array");
        int sizeArray = scn.nextInt();
        int[] arrayConsole = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            System.out.println("Input value of array");
            arrayConsole[i] = scn.nextInt();
        }
        return arrayConsole;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int sizeArray = size;
        int maxValue = maxValueExclusion;
        int[] arrayRandom = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            arrayRandom[i]= (int) ((Math.random() * (maxValue - 0)) + 0);
        }
        return  arrayRandom;




    }


}

