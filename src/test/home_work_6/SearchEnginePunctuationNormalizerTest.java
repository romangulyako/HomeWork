package test.home_work_6;

import home_work_6.api.ISearchEngine;
import home_work_6.search_engines.RegExSearch;
import home_work_6.search_engines.SearchEnginePunctuationNormalizer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchEnginePunctuationNormalizerTest {
    private final ISearchEngine searchEngine = new SearchEnginePunctuationNormalizer(new RegExSearch());

    @Test
    public void searchTest1() {
        String text = "Привет, привет. ПрИВЕт!";
        String wordForSearch = "привет";
        long result = 1;

        assertEquals(result,searchEngine.search(text,wordForSearch));
    }

    @Test
    public void searchTest2() {
        String text = "Привет-привет. ПрИВЕт!";
        String wordForSearch = "Привет-привет ";
        long result = 1;

        assertEquals(result,searchEngine.search(text,wordForSearch));
    }
}
