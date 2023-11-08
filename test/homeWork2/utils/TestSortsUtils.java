package homeWork2.utils;


import home_work_2.utils.SortsUtils;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestSortsUtils {
    @Test
    @DisplayName("sort")
    void check1() {
        int [] result1 = SortsUtils.sort( new int[] {7,3,4,5,2});
        int [] expected=new int[] {2,3,4,5,7};
        assertArrayEquals(expected, result1);
    }

    @Test
    @DisplayName("shake")
    void check2() {
        int [] result1 = SortsUtils.shake( new int[] {7,3,4,5,2});
        int [] expected=new int[] {2,3,4,5,7};
        assertArrayEquals(expected, result1);
    }

}
