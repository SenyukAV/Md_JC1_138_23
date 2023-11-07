package homeWork3.SimpleTest;

//import home_work_3.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SimpleTest {
    ICalculator clc1 = new CalculatorWithMathCopy();
    ICalculator clc2= new CalculatorWithMathExtends();
    ICalculator clc3= new CalculatorWithOperator();

    @Test
    @DisplayName("sum")
    void check1() {
        assertEquals(3.0, clc1.sum(1.0,2.0));
        assertEquals(4.0, clc2.sum(2.0,2.0));
        assertEquals(12.0, clc3.sum(10.0,2.0));

    }

    @Test
    @DisplayName("multiplication")
    void check2() {
        assertEquals(2.0, clc1.multiplication(1.0,2.0));
        assertEquals(200.0, clc2.multiplication(10.0,20.0));
        assertEquals(24.0, clc3.multiplication(8.0,3.0));

    }

    @Test
    @DisplayName("multiplication")
    void check3() {
        assertEquals(2.0, clc1.multiplication(1.0,2.0));
        assertEquals(200.0, clc2.multiplication(10.0,20.0));
        assertEquals(24.0, clc3.multiplication(8.0,3.0));

    }

    @Test
    @DisplayName("subtract")
    void check4() {
        assertEquals(3.0, clc1.subtract(5.0,2.0));
        assertEquals(80.0, clc2.subtract(100.0,20.0));
        assertEquals(5.0, clc3.subtract(8.0,3.0));

    }

    @Test
    @DisplayName("subtract")
    void check5() {
        assertEquals(3.0, clc1.subtract(5.0,2.0));
        assertEquals(80.0, clc2.subtract(100.0,20.0));
        assertEquals(5.0, clc3.subtract(8.0,3.0));

    }

    @Test
    @DisplayName("division")
    void check6() {
        assertEquals(3.0, clc1.division(6.0,2.0));
        assertEquals(5.0, clc2.division(100.0,20.0));
        assertEquals(3.0, clc3.division(9.0,3.0));

    }

    @Test
    @DisplayName("exponentiation")
    void check7() {
        assertEquals(36.0, clc1.exponentiation(6.0,2));
        assertEquals(100.0, clc2.exponentiation(10.0,2));
        assertEquals(8.0, clc3.exponentiation(2.0,3));

    }

    @Test
    @DisplayName("exponentiation")
    void check8() {
        assertEquals(6.0, clc1.moduleOfNumber(6.0));
        assertEquals(100.0, clc2.moduleOfNumber(-100.0));
        assertEquals(8.0, clc3.moduleOfNumber(-8.0));

    }

    @Test
    @DisplayName("sqrt")
    void check9() {
        assertEquals(3.0, clc1.sqrt(9.0));
       assertEquals(10.0, clc2.sqrt(100.0));
      assertEquals(8.0, clc3.sqrt(64.0));

    }






}
