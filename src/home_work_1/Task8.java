package home_work_1;

public class Task8 {
    public static void main (String [] args) {
        toBin(42);

    }

    public static void toBin(int n) {
        int m;
        String str="";
        while (n!=0){
            m=n%2;
            str=m+str;
            n=n/2;
        }
        System.out.println(str);


    }

}
