package arrays;

/*

	2.1.2. Написать метод public static int[] arrayRandom(int size, int maxValueExclusion). Данный метод принимает два аргумента. Первый (size) указывает размер массива
 который мы хотим получить. Второй (maxValueExclusion) указывает до какого числа генерировать рандомные числа.
			2.1.2.1. Пример в отдельном классе с main. int[] container = arrayRandom(5, 100). Результат: В методе arrayRandom будет создан массив размером 5 с числами
 от 0 до 99 (использовать класс Random) и сохранён в переменную container.
 */

import home_work_2.utils.ArraysUtils;

public class Task_2_1_2 {
    public static void main (String [] args) {
        int[] container = ArraysUtils.arrayRandom(3,100);
        for( int array : container) {
            System.out.println(array);
        }

    }
}
