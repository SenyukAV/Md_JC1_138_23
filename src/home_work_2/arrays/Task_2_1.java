package home_work_2.arrays;
/*
2.1. Создать класс ArraysUtils. В этом классе не должно быть main метода. В этом классе написать следующие методы:
		2.1.1. Написать метод public static int[] arrayFromConsole(). Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.
			2.1.1.1. Пример в отдельном классе с main. int[] container = arrayFromConsole(). Результат: В методе arrayFromConsole будет запрошена информация у пользователя,
 пользователь вводит размер (3) и его элементы по порядку {4, 17, 32}. Соответсвенно будет создан массив размером 3 с элементами {4, 17, 32} и сохранён в переменную container.

 */


import home_work_2.utils.ArraysUtils;

public class Task_2_1 {
    public static void main (String [] args) {
        int[] container = ArraysUtils.arrayFromConsole();
       for( int array : container) {
           System.out.println(array);
       }

    }

}
