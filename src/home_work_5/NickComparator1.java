package home_work_5;

import java.util.Comparator;

public class NickComparator1 implements Comparator<Animal> {

    public int compare(Animal x, Animal y) {

        return x.getNick().compareTo(y.getNick());
    }
}
