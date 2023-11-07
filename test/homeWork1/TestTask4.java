package homeWork1;

import  home_work_1.Task4;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestTask4 {
    @Test
    @DisplayName("odd Or Even")
    void  check1 () {
        String result1= Task4.oddOrEven(4);
        assertEquals("Even",result1);
    }

    @Test
    @DisplayName("find Middle Number")
    void  check2 () {
        int result1= Task4.findMiddleNumber(4,5,6);
        assertEquals(5,result1);
    }

    @Test
    @DisplayName("divisibility of  numbers")
    void  check3 () {
        boolean result1= Task4.divisibilityOfNumber(10,5);
        assertEquals(true,result1);
    }

    @Test
    @DisplayName("define Symbol")
    void  check4 () {
        boolean result1= Task4.defineSymbol('a');
        assertEquals(true,result1);
    }

    @Test
    @DisplayName("definition Of Leap Year")
    void  check5 () {
        boolean result1= Task4.definitionOfLeapYear(1984);
        assertEquals(true,result1);
    }

}
