package home_work_2.loop;
/*
 1.6. Вывести таблицу умножения в консоль. В консоли должно получиться также как и на картинке
 */

public class Task6 {
    public static void main (String [] args) {
        //выводим первый блок таблтцы умножения
        for (int n1=1;n1<=10;n1++) {
            for (int n2=2;n2<=5;n2++){
                System.out.print(" | " +n2 + "*" + n1 + "=" + n1*n2 +" | " );
            }
            System.out.println("");
        }
        System.out.println("_________________________________________________");
        //выводим второй блок таблтцы умножения
        for (int n1=1;n1<=10;n1++) {
            for (int n2=6;n2<=9;n2++){
                System.out.print(" | " +n2 + "*" + n1 + "=" + n1*n2 +" | " );
            }
            System.out.println("");
        }
        System.out.println("ЭТО");
        System.out.println("НУЖНО");
        System.out.println("ЗНАТЬ");
    }
}
