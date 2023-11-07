package home_work_1;

public class Task5 {
   public static void main(String [] args){
   if ( wakeUp(sleepIn(true,true)) ) {
       System.out.println("You can sleep further");
   } else  System.out.println("You have to wake up");
   }
    public static boolean sleepIn(boolean weekday,boolean vacation) {
       if(!weekday||vacation){
           return  true;
       } return false;
    }
    public  static boolean  wakeUp(boolean result) {
       if(true) {
           return  true;
          // System.out.println("You can sleep further");
       }  return false;
       //else   System.out.println("You have to wake up");
    }
}