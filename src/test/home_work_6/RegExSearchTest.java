package test.home_work_6;

import home_work_6.api.ISearchEngine;
import home_work_6.search_engines.RegExSearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegExSearchTest {
    private final ISearchEngine searchEngine = new RegExSearch();

    @Test
    public void searchTest1() {
        String text = "привет, как дела!";
        String wordForSearch = "как";
        long result = 1;

        assertEquals(result,searchEngine.search(text,wordForSearch));
    }

    @Test
    public void searchTest2() {
        String text = "привет,какдела!";
        String wordForSearch = "как";
        long result = 0;

        assertEquals(result,searchEngine.search(text,wordForSearch));
    }

    @Test
    public void searchTest3() {
        String text = "привет;какдела!";
        String wordForSearch = "как";
        long result = 0;

        assertEquals(result,searchEngine.search(text,wordForSearch));
    }

    @Test
    public void searchTest4() {
        String text = "как дела!.Что делаешь?";
        String wordForSearch = "как";
        long result = 1;

        assertEquals(result,searchEngine.search(text,wordForSearch));
    }

    @Test
    public void searchTest5() {
        String text = " Привет-привет ";
        String wordForSearch = "привет";
        long result = 0;

        assertEquals(result,searchEngine.search(text,wordForSearch));
    }

    @Test
    public void searchTest6() {
        String text = " 4-х ";
        String wordForSearch = "4-х";
        long result = 1;

        assertEquals(result,searchEngine.search(text,wordForSearch));
    }

    @Test
    public void searchTest7() {
        String text = "один и 1";
        String wordForSearch1 = "один";
        String wordForSearch2 = "и";
        String wordForSearch3 = "1";
        long result = 1;

        assertEquals(result,searchEngine.search(text,wordForSearch1));
        assertEquals(result,searchEngine.search(text,wordForSearch2));
        assertEquals(result,searchEngine.search(text,wordForSearch3));
    }

    @Test
    public void searchTest8() {
        String text = "бабушка бабушке бабушку";
        String wordForSearch1 = "бабушка";
        String wordForSearch2 = "бабушке";
        String wordForSearch3 = "бабушку";
        long result = 1;

        assertEquals(result,searchEngine.search(text,wordForSearch1));
        assertEquals(result,searchEngine.search(text,wordForSearch2));
        assertEquals(result,searchEngine.search(text,wordForSearch3));
    }

    @Test
    public void searchTest9() {
        String text = "Это текст для поиска слова \"Это\". Это слово встречается 3 раза";
        String wordForSearch = "Это";
        long result = 3;

        assertEquals(result,searchEngine.search(text,wordForSearch));
    }

    @Test
    public void searchTest10() {
        String text = "Мама мылом мыла и намыливала раму";
        String wordForSearch = "мыл";
        long result = 0;

        assertEquals(result,searchEngine.search(text,wordForSearch));
    }
}
