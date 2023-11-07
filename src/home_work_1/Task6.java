package home_work_1;

import java.util.Scanner;

public class Task6  implements  ICommunicationPrinter{
    public static void main(String[] args){
       // Scanner scn= new Scanner(System.in);
      //  String name=scn.nextLine();
       // detectName1(name);
        //detectName2(name);
      //  detectName3(name);
        String result;
        Task6 n = new Task6();
      System.out.println(  n.welcom("Вася"));





    }

    public static void detectName1(String s){
        if((s.equals("Вася")) ||(s.equals("Анастасия")))  {
            System.out.println("Привет! \n" + "Я тебя так долго ждал" );
        }
        else {
            System.out.println("Добрый день, а вы кто?" );
        }
    }
    public static  void detectName2(String s){
            if(s.equals("Вася"))   {
                System.out.println("Привет! \n" + "Я тебя так долго ждал" );
            }
            else if(s.equals("Анастасия")) {
                System.out.println("Я тебя так долго ждал" );
            }
            else {
                System.out.println("Добрый день, а вы кто?" );
            }

        }

    public static void detectName3(String s) {
       switch (s) {
           case "Вася":
               System.out.println("Привет! \n" + "Я тебя так долго ждал" );
                break;
           case "Анастасия":
               System.out.println("Я тебя так долго ждал" );
               break;
           default:
               System.out.println("Добрый день, а вы кто?" );


       }

    }

    @Override
    public  String welcom(String name) {
        switch (name) {
            case "Вася":

               return   "Привет! \n  Я тебя так долго ждал" ;

            case "Анастасия":
                return "Я тебя так долго ждал";
                //System.out.println("Я тебя так долго ждал" );

            default:
                return "Добрый день, а вы кто?";
                //System.out.println("Добрый день, а вы кто?" );


        }
    }
}

