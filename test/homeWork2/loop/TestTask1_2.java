package homeWork2.loop;

import home_work_2.loop.Task2;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestTask1_2 {


    @Test
    @DisplayName("checkNumber")
    void check1() {


        int result1 = Task2.checkNumber("181232375");
        assertEquals(10080, result1);
    }
}
