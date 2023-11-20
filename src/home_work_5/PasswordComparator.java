package home_work_5;

public class PasswordComparator  implements Comparator<Person> {

    public int compare(Person x, Person y) {

        return x.getPassword().compareTo(y.getPassword());
    }
}
