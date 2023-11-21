package home_work_5;
import java.util.Comparator;
public class NickComparator implements Comparator<Person>{

  @Override
    public int compare(Person x, Person y) {

        return x.getNick().compareTo(y.getNick());
    }


    public int compare(Animal x, Animal y) {

        return x.getNick().compareTo(y.getNick());
    }
}
