package homeWork_6;

import home_work_6.EasySearch;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestSearch {
    @Test
    @DisplayName("Search")
    void  check1 () {
        EasySearch easySearch =new EasySearch();
        String text= "aааааааааааа Война оооооооооооо  фффффффффффф  ыыыыыыыыыыыыы";
       long result1= easySearch.search(text,"Война");
         assertEquals(1,result1);

    }

    @Test
    @DisplayName("Search2")
    void  check2 () {
        EasySearch easySearch =new EasySearch();
        String text= "aааааааааааа Война оооооооооооо  фффффффффффф  ыыыыыыыыыыыыы";
        long result1= easySearch.search(text,"Война");
        assertNotEquals(2,result1);

    }
}
