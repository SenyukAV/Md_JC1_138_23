package homeWork1;
import  home_work_1.Task1;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestTask1 {

    @Test
    @DisplayName("XOR")
    void  check1 () {
        int result1=Task1.toBinaryXor(5,7);
        assertEquals(2,result1);

    }

    @Test
    @DisplayName("AND")
    void  check2 () {
        int result1=Task1.toBinaryAnd(5,7);
        assertEquals(5,result1);

    }
}
