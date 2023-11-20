package home_work_5;

public class AgeComparator implements Comparator<Entity> {

    public int compare(Entity x, Entity y){

        if(x.getAge()> y.getAge())
            return 1;
        else if(x.getAge()< y.getAge())
            return -1;
        else
            return 0;
    }
}
