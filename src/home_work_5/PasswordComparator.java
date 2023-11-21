package home_work_5;
import java.util.Comparator;

public class PasswordComparator  implements Comparator<Person> {

    @Override
    public int compare(Person x, Person y) {

        return x.getPassword().compareTo(y.getPassword());
    }
}
