package homeWork2.loop;

import home_work_2.loop.Task1;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestTask1_1 {

    @Test
    @DisplayName("multiplier")
    void check1() {


        long result1 = Task1.multiplier("12");
        assertEquals(479001600, result1);
    }
}
