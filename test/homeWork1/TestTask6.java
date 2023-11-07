package homeWork1;

import  home_work_1.Task6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestTask6 {
    @Test
    @DisplayName("welcom")
    void  check1 () {

        Task6 t =new Task6();
        String result1= t.welcom("Вася");
        assertEquals("Привет! \n  Я тебя так долго ждал",result1);
    }
}
