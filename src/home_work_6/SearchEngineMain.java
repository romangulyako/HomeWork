package home_work_6;

import home_work_6.api.ISearchEngine;
import home_work_6.api.ITextHandler;
import home_work_6.search_engines.CaseInsensitiveSearchEngine;
import home_work_6.search_engines.EasySearch;
import home_work_6.search_engines.RegExSearch;
import home_work_6.search_engines.SearchEngineCaseNormalizer;

public class SearchEngineMain {
    public static void main(String[] args) {
        String path = "Война и мир_книга.txt";
        ITextHandler textHandler = new BookHandler(path);

        String caseSensitiveTitle = "Подсчет количества слов \"война\", \"и\" и \"мир\" с учетом регистра";
        String caseInsensitiveTitle = "Подсчет количества слов \"война\", \"и\" и \"мир\" без учета регистра";

        System.out.println("-------------------------------------------------------------");
        System.out.println("Тест EasySearch");
        System.out.println("-------------------------------------------------------------");

        ISearchEngine searchEngine = new EasySearch();
        printWarAndPeaceCount(searchEngine,textHandler,caseSensitiveTitle);

        searchEngine = new CaseInsensitiveSearchEngine(new EasySearch());
        printWarAndPeaceCount(searchEngine,textHandler,caseInsensitiveTitle);

        System.out.println("-------------------------------------------------------------");
        System.out.println("Тест RegExSearch");
        System.out.println("-------------------------------------------------------------");

        searchEngine = new RegExSearch();
        printWarAndPeaceCount(searchEngine,textHandler,caseSensitiveTitle);

        searchEngine = new CaseInsensitiveSearchEngine(new RegExSearch());
        printWarAndPeaceCount(searchEngine,textHandler,caseInsensitiveTitle);

        System.out.println("-------------------------------------------------------------");
        System.out.println("Тест SearchEngineCaseNormalizer");
        System.out.println("-------------------------------------------------------------");

        searchEngine = new SearchEngineCaseNormalizer(new RegExSearch());
        printWarAndPeaceCount(searchEngine,textHandler,caseSensitiveTitle);

        searchEngine = new CaseInsensitiveSearchEngine(new SearchEngineCaseNormalizer(new RegExSearch()));
        printWarAndPeaceCount(searchEngine,textHandler,caseInsensitiveTitle);
    }

    public static void printWarAndPeaceCount(ISearchEngine searchEngine, ITextHandler textHandler, String title) {
        long warCount = searchEngine.search(textHandler.getText(), "война");
        long andCount = searchEngine.search(textHandler.getText(), "и");
        long peaceCount = searchEngine.search(textHandler.getText(), "мир");

        System.out.println(title);
        System.out.println("война: " + warCount);
        System.out.println("и: " + andCount);
        System.out.println("мир: " + peaceCount);
        System.out.println("----------------------------");
    }
}
