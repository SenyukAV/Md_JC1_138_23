package home_work_5;

public class NameComparator implements Comparator<Person> {

    public int compare(Person x, Person y) {

        return x.getName().compareTo(y.getName());
    }


}
