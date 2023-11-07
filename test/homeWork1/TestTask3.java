package homeWork1;

import  home_work_1.Task3;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestTask3 {


    @Test
    @DisplayName("Absolute value")
    void  check1 () {
        int result1= Math.abs(5);
        assertEquals(5,result1);
    }

    @Test
    @DisplayName("POW")
    void  check2 () {
        double result1= Math.pow(5,2);
        assertEquals(25,result1);
    }

    @Test
    @DisplayName("Square root")
    void  check3 () {
        double result1= Math.sqrt(25);
        assertEquals(5,result1);
    }


}
