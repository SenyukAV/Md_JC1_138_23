package homeWork1;
import  home_work_1.Task7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestTask7 {

        @Test
        @DisplayName("phone number")
        void check1() {

            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
            String result1 = Task7.createPhoneNumber(array);
            assertEquals("(123) 456-7890.", result1);
        }

    }

