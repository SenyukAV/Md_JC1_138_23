package loop;

/*
    1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
     Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
        Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
    	1.1.1. Используя только цикл
 */

import java.util.Scanner;

public class Task1 {
    public static void main (String [] args) {
        String number_str;
        Boolean semaphore=false;
        Boolean result=false;
        long finalResult=1L;
        long max= 9_223_372_036_854_775_806L;
        //ввод значения будет происходить пока пользователь не введет правильное занчение (число)
        do {
            //Scanner scn= new Scanner(System.in);
            // number_str= scn.nextLine();
             number_str= args[0];
             char [] array=number_str.toCharArray();
             for (char symbls : array) {
               result=Character.isDigit(symbls);
                //проверяем, что символ является числом
                 if (!(result)){
                     semaphore=true;
                     System.out.println("Input right number");
                     break;
                 } else {
                     semaphore=false;
                 }
             }
        } while (semaphore);
        long number =Long.parseLong(number_str);
        //проверка на корректность условию
        if(number>0 && number<max){
            for (int i=1;i<=number;i++){
                finalResult=finalResult*i;
                if (finalResult>=max || finalResult==0) {
                    System.out.println(" ");
                    System.out.println("Result is HUGE.Input right number");
                    break;
                }
                    if (i==number){
                    System.out.print(i);
                } else {System.out.print(i + "*");}

            }
            if (finalResult==0){

            } else {
            System.out.print("=" +finalResult);}
        } else  {System.out.println("Input right number");}

    }
}