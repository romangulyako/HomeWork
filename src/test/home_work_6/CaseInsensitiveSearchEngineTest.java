package test.home_work_6;

import home_work_6.api.ISearchEngine;
import home_work_6.search_engines.CaseInsensitiveSearchEngine;
import home_work_6.search_engines.RegExSearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CaseInsensitiveSearchEngineTest {
    private final ISearchEngine searchEngine = new CaseInsensitiveSearchEngine(new RegExSearch());

    @Test
    public void searchTest1() {
        String text = "Привет, привет. ПрИВЕт!";
        String wordForSearch = "привет";
        long result = 3;

        assertEquals(result,searchEngine.search(text,wordForSearch));
    }

    @Test
    public void searchTest2() {
        String text = "Привет, привет. ПрИВЕт!";
        String word = null;

        assertThrows(NullPointerException.class, () -> searchEngine.search(text,word));
    }

    @Test
    public void searchTest3() {
        String text = null;
        String word = "hello";

        assertThrows(NullPointerException.class, () -> searchEngine.search(text,word));
    }
}
