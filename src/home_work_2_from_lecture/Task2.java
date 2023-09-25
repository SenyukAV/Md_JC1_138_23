package home_work_2_from_lecture;
/*
Вероятность случайных четных чисел
 */


public class Task2 {
    public static void main (String [] args){
        int even=0;
        int odd=0;
        int number=0;
        for (int i =0;i<1000;i++){
            number=(int) (Math.random()*(1000)) + 0;
           // System.out.println(number);
            if(number%2==0){
                odd++;
            } else {
                even++;
            }
        }
        System.out.println(even);
        System.out.println(odd);
        if(even>odd){
            System.out.println("More even");
        } else if(even<odd) {
            System.out.println("More odd");
        } else  {
            System.out.println("Equale even and odd");
        }



    }
}
