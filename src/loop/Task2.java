package loop;
/*
  1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой
   и вывести ход вычислений в консоль. Пользователь обязан ввести целое число.
   Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
		1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
		1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
		1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число

 */

public class Task2 {
    public static void main(String [] args) {
       String number=args[0];

        checkNumber(number);
    }

    public static void checkNumber(String numbers){
        int result=1;
        char [] array=numbers.toCharArray();
        for (char num: array) {
            //проверяем, что введено не целое число
            if(num == '.') {
                System.out.println("");
                System.out.println("Not an integer entered");
                return;
                //проверяем, что введено не  число
            } else if(!(Character.isDigit(num))) {
                System.out.println("");
                System.out.println("Not a number entered");
                return;
            } else {
                //получаем необходимый результат по условию
                result=result*(Character.getNumericValue(num));
                if (num==array[array.length-1]){
                    System.out.print(num);
                } else {
                    System.out.print(num+"*");
                }
            }

        }
        System.out.println("=" + result);
    }


}
