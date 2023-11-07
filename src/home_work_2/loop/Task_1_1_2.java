package home_work_2.loop;
/*
1.1. Peremnozhit' chisla ot 1 do chisla (vklyuchitel'no) vvedennogo cherez argument k ispolnyayemoy programme
1.1.2.* Ispol'zuya rekursiyu
 */

public class Task_1_1_2 {

    public static void main(String[] args) {
        String number_str;
        Boolean semaphore = false;
        Boolean result = false;
        long finalResult = 1L;
        long max = 9_223_372_036_854_775_806L;
        //ввод значения будет происходить пока пользователь не введет правильное занчение (число)
        do {
            //Scanner scn = new Scanner(System.in);
            //number_str = scn.nextLine();
            number_str= args[0];
            char[] array = number_str.toCharArray();
            for (char symbls : array) {
                result = Character.isDigit(symbls);
                //проверяем, что символ является числом
                if (!(result)) {
                    semaphore = true;
                    System.out.println("Input right number");
                    break;
                } else {
                    semaphore = false;
                }
            }
        } while (semaphore);
        long number = Long.parseLong(number_str);
        //проверка на корректность условию
        if (number > 0 && number < max) {
            finalResult=recursion(number);

        }
        if (finalResult == 0) {

        } else {
            System.out.print("1");
            System.out.print("=" + finalResult);
        }
    }

    static long recursion(long x){
        if (x == 1){

            return 1;
        }
        System.out.print(x +" *");
        return x * recursion(x - 1);
    }
}
