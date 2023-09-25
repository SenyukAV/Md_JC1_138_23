package home_work_2_from_lecture;

/*
Максимальный  из элементов  массива  с четным индексом
 */

public class Task8 {
    public static  void main (String [] args){
        int [] array={-10,-5,11,2,3,4,5,6,22,-222,0,333,3,34,54};
        int max=array[2];
        for (int i=0;i<array.length;i++){
            if((i%2==0) && (array[i]>max)) {
                max=array[i];
            }
        }
        System.out.println(max);

    }
}
