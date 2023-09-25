package home_work_2_from_lecture;

public class Task10 {
    public static void main(String [] args){
        int [] array={-10,-5,11,2,3,4,5,6,22,-222,0,-333,3,34,54};
        int min=array[0];
        int min2=array[0];
        for (int i=0;i<array.length;i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        System.out.println(min);
        for(int n=0;n<array.length;n++){
            if((min2>array[n])&&(array[n]!=min)){
                min2=array[n];
            }
        }
        System.out.println(min2);
    }
}
