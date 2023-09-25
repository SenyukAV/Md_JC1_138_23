package home_work_2_from_lecture;

/*
Сумма четных положительных массиов
 */

public class Task7 {
    public static void main(String [] args){
        int [] array={-10,-5,11,2,3,4,5,6,22,-222,0,333,3,34,54};
        int sum=0;
        for(int i=0;i<array.length;i++){
            if((array[i]>0)&&(array[i]%2==0)){
                sum=sum+array[i];
            }
        }
        System.out.println(sum);

    }

}
