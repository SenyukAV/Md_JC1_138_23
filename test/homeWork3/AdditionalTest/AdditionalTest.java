package homeWork3.AdditionalTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.additional.CalculatorWithCounterClassic;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AdditionalTest {


    ICalculator  clc =new CalculatorWithOperator();
    CalculatorWithCounterAutoAgregationInterface cl= new CalculatorWithCounterAutoAgregationInterface(clc);

    @Test
    @DisplayName("sum")
    void check1() {
        assertEquals(3.0, cl.sum(1.0,2.0));
        assertEquals(1,cl.countOperation);

    }

    @Test
    @DisplayName("multiplication")
    void check2() {
        assertEquals(2.0, cl.multiplication(1.0,2.0));
        assertEquals(1,cl.countOperation);


    }

    @Test
    @DisplayName("multiplication")
    void check3() {
        assertEquals(2.0, cl.multiplication(1.0,2.0));
        assertEquals(1,cl.countOperation);

    }

    @Test
    @DisplayName("subtract")
    void check4() {
        assertEquals(3.0, cl.subtract(5.0,2.0));
        assertEquals(1,cl.countOperation);

    }

    @Test
    @DisplayName("subtract")
    void check5() {
        assertEquals(3.0, cl.subtract(5.0,2.0));
        assertEquals(1,cl.countOperation);


    }

    @Test
    @DisplayName("division")
    void check6() {
        assertEquals(3.0, cl.division(6.0,2.0));
        assertEquals(1,cl.countOperation);

    }

    @Test
    @DisplayName("exponentiation")
    void check7() {
        assertEquals(36.0, cl.exponentiation(6.0,2));
        assertEquals(1,cl.countOperation);

    }

    @Test
    @DisplayName("exponentiation")
    void check8() {
        assertEquals(6.0, cl.moduleOfNumber(6.0));
        assertEquals(1,cl.countOperation);


    }

    @Test
    @DisplayName("sqrt")
    void check9() {
        assertEquals(3.0, cl.sqrt(9.0));
        assertEquals(1,cl.countOperation);


    }
}
