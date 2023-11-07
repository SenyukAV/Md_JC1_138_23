package homeWork1;

import home_work_1.Task4;
import  home_work_1.Task5;

import static home_work_1.Task5.sleepIn;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestTask5 {
    @Test
    @DisplayName("wake up")
    void  check1 () {

        Boolean result1= Task5.wakeUp(sleepIn(true,true));
        assertEquals(true,result1);
    }
}
