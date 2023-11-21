package home_work_5;
import java.util.Comparator;
public class AgeComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal x, Animal y){

        if(x.getAge()> y.getAge())
            return 1;
        else if(x.getAge()< y.getAge())
            return -1;
        else
            return 0;
    }
}
