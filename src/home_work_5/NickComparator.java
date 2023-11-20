package home_work_5;

public class NickComparator implements Comparator<Person> {

    public int compare(Person x, Person y) {

        return x.getNick().compareTo(y.getNick());
    }
}
