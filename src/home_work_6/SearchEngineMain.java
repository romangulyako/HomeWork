package home_work_6;

import home_work_6.api.ISearchEngine;
import home_work_6.api.ITextHandler;
import home_work_6.search_engines.CaseInsensitiveSearchEngine;
import home_work_6.search_engines.RegExSearch;

import java.io.IOException;

public class SearchEngineMain {
    public static void main(String[] args) throws IOException {
        String path = "Война и мир_книга.txt";
        ITextHandler textHandler = new BookHandler(path);

        System.out.println("Подсчет количества слов \"война\", \"и\" и \"мир\" с учетом регистра");
        ISearchEngine searchEngine = new RegExSearch();
        printWarAndPeaceCount(searchEngine,textHandler);

        System.out.println("Подсчет количества слов \"война\", \"и\" и \"мир\" без учета регистра");
        searchEngine = new CaseInsensitiveSearchEngine(new RegExSearch());
        printWarAndPeaceCount(searchEngine,textHandler);
    }

    public static void printWarAndPeaceCount(ISearchEngine searchEngine, ITextHandler textHandler) {
        long warCount = searchEngine.search(textHandler.getText(), "война");
        long andCount = searchEngine.search(textHandler.getText(), "и");
        long peaceCount = searchEngine.search(textHandler.getText(), "мир");

        System.out.println("война: " + warCount);
        System.out.println("и: " + andCount);
        System.out.println("мир: " + peaceCount);
        System.out.println("----------------------------");
    }
}
