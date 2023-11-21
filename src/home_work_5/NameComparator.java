package home_work_5;
import java.util.Comparator;
public class NameComparator implements Comparator<Person> {

    @Override
    public int compare(Person x, Person y) {

        return x.getName().compareTo(y.getName());
    }


}
