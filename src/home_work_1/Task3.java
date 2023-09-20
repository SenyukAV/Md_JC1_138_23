package home_work_1;
import static java.lang.Math.*;

public class Task3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 100;
        int number1 = a + (int) (Math.random() * b);
        int number2 = a + (int) (Math.random() * b);
        System.out.println("First number " +number1);
        System.out.println("Second number " +number2);
        System.out.println("Absolute value= " +Math.abs(number1));
        System.out.println("Returns the value of the first argument raised to the power of the second argument =>" +Math.pow(number1,number2));
        System.out.println("Returns the correctly rounded positive square root= " +Math.sqrt(number1));
    }




}
