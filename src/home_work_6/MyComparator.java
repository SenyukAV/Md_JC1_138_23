package home_work_6;

import java.util.Comparator;
import java.util.Map;

public class MyComparator implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
        int reverseValueCompared = Integer.compare(e2.getValue(), e1.getValue());
        if (reverseValueCompared == 0) {
            return e1.getKey().compareTo(e2.getKey());
        }
        return reverseValueCompared;
    }

}
