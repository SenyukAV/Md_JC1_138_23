package home_work_1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        String name=scn.nextLine();
        detectName1(name);
        detectName2(name);
        detectName3(name);


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

    }

