package home_work_1;

public class Task2 {
    public static void main(String [] args) {

        double a1=  5*1.0 + 2*1.0 / 8 ;
        System.out.println(a1);
        double a2=(5*1.0 + 2) / 8 * 1.0;
        System.out.println(a2);
        int b1=2;
        double a3=(5*1.0 + b1++) / 8*1.0;
        System.out.println(a3);
        int b3=8;
        double a4=(5*1.0 + b1++) / --b3*1.0;
        System.out.println(a4);
        double a5=(5*1.0 + 7 > 20 ? 68 : 22 * 2 >> b3++) / (--b3 )*1.0;
        System.out.println(a5);




    }
}
