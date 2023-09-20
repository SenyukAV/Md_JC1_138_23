package home_work_1;

public class Task5 {
   public static void main(String [] args){
    wakeUp(sleepIn(true,true));
   }
    public static boolean sleepIn(boolean weekday,boolean vacation) {
       if(!weekday||vacation){
           return  true;
       } return false;
    }
    public  static void  wakeUp(boolean result) {
       if(true) {
           System.out.println("You can sleep further");
       } else   System.out.println("You have to wake up");
    }
}