package homeWork2.loop;

import home_work_2.loop.Task5;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestTask1_5 {
    @Test
    @DisplayName("findLargestDigitOfNaturalNumber")
    void check1() {


        int result1 = Task5.findLargestDigitOfNaturalNumber(456789);
        assertEquals(9, result1);
    }

    @Test
    @DisplayName("CountEvenAndOddDigitsOfNumber")
    void check2() {


        int result1 = Task5.CountEvenAndOddDigitsOfNumber(12345678);
        assertEquals(4, result1);
    }
    @Test
    @DisplayName("fibonacciSequence")
    void check3() {


        String result1 = Task5.fibonacciSequence(5);
        assertEquals("1 1 2 3 5", result1);
    }

    @Test
    @DisplayName("PrintSeriesOfNumbersInRangeInIncrements")
    void check4() {


        String result1 = Task5.PrintSeriesOfNumbersInRangeInIncrements(1,2,5);
        assertEquals("1 3 5 ", result1);
    }


    @Test
    @DisplayName("NumberReversal")
    void check5() {


        String result1 = Task5.NumberReversal(23456);
        assertEquals("65432", result1);
    }

}
