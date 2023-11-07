package homeWork4;


import home_work_4.DataContainer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DataContainerTest {

    DataContainer <Integer> dtInt = new DataContainer<>();
    DataContainer <String> dtStr = new DataContainer<>();

    @Test
    @DisplayName("add")
    void check1() {

        assertNotEquals(999, dtInt.add(1));
        assertEquals(1, dtInt.add(2));
        assertEquals(0, dtStr.add("Hi"));
        assertEquals(1, dtStr.add("Hello"));
    }

    @Test
    @DisplayName("get")
    void check2() {
        dtInt.add(1);
        dtInt.add(2);
        dtStr.add("Hi");
        dtStr.add("Hello");

        assertNotEquals(999, dtInt.get(0));
        assertEquals(2, dtInt.get(1));
        assertEquals("Hello", dtStr.get(1));
    }

    @Test
    @DisplayName("getItems")
    void check3() {
        dtInt.add(1);
        dtInt.add(2);
        dtStr.add("Hi");
        dtStr.add("Hello");

        Integer [] result1={1,2,null,null,null,null};
        String [] result2={"Hi","Hello",null,null,null,null};

        assertArrayEquals(result1,dtInt.getItems());
        assertArrayEquals(result2,dtStr.getItems());


    }

    @Test
    @DisplayName("delete _ index")
    void check4() {
        dtInt.add(1);
        dtInt.add(2);
        dtStr.add("Hi");
        dtStr.add("Hello");

        assertTrue(dtInt.delete(2));
        assertFalse(dtStr.delete(33));

    }

    @Test
    @DisplayName("delete _ item")
    void check5() {
        dtInt.add(1);
        dtInt.add(2);
        dtStr.add("Hi");
        dtStr.add("Hello");

        assertTrue(dtStr.delete("Hi"));
        assertFalse(dtInt.delete(0));

    }

}
