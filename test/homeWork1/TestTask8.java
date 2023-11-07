package homeWork1;


import  home_work_1.Task8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class TestTask8
{

    @Test
    @DisplayName("Transfer to Bin")
    void check1() {


        String result1 = Task8.toBin(42);
        assertEquals("101010", result1);
    }

}
