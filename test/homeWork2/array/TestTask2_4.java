package homeWork2.array;
import home_work_2.arrays.Task_2_4;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTask2_4 {

    @Test
    @DisplayName("sumOfEvenPositiveElementsArray")
    void check1() {
        int result1 = Task_2_4.sumOfEvenPositiveElementsArray(new int[] {2,3,4,5,7});
        assertEquals(6, result1);
    }

    @Test
    @DisplayName("maximumArrayElementsWithEvenIndexes")
    void check2() {
        int result1 = Task_2_4.maximumArrayElementsWithEvenIndexes(new int[] {2,3,4,5,7});
        assertEquals(7, result1);
    }

    @Test
    @DisplayName("arrayElementsLessArithmeticMean")
    void check3() {
        int [] result1 = Task_2_4.arrayElementsLessArithmeticMean(new int[] {1,2,3,4});
        int[] expect=new int[] {1,2};
        assertArrayEquals(expect,result1);

    }

    @Test
    @DisplayName("arrayElementsLessArithmeticMean")
    void check4() {
        int [] result1 = Task_2_4.findTwoSmallestElementsArray(new int[] {0,1,2,3,4});
        int[] expect=new int[] {0,1};
        assertArrayEquals(expect,result1);

    }

    @Test
    @DisplayName("arrayElementsLessArithmeticMean")
    void check5() {
        int [] result1 = Task_2_4.compressArrayDeletingElementsBelongingInterval(new int[] {0,1,2,3,4,5},2,3);
        int[] expect=new int[] {0,1,4,5,0,0};
        int[] expect1=new int[] {1,1,4,5,0,0};
        assertArrayEquals(expect,result1);
        assertNotEquals(expect1,result1);

    }


    @Test
    @DisplayName("sumDigitsArray")
    void check6() {
        int  result1 = Task_2_4.sumDigitsArray(new int[] {0,1,2,3,4,5});
        int expect=15;
        int expect1=16;
       assertEquals(expect,result1);
        assertNotEquals(expect1,result1);

    }
}
