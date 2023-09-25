package home_work_2_from_lecture;

/*
Элементы массив которые меньше среднего арефметического
 */

public class Task9 {
    public static void main(String [] args){
        int [] array={-10,-5,11,2,3,4,5,6,22,-222,0,333,3,34,54};
        int sum_up=0;
        for (int i=0;i<array.length;i++){
            sum_up=sum_up+array[0];
        }
        int average=sum_up/array.length;
        for (int n=0;n<array.length;n++){
            if(array[n]<average){
                System.out.println(array[n]);
            }

        }
    }
}
