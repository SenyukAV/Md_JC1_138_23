package homeWork2.loop;
import home_work_2.loop.Task3;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestTask1_3 {
    @Test
    @DisplayName("Pow")
    void check1() {


       String result1 = Task3.squared("7.5","2");
       assertEquals("56.25", result1);
    }
}
