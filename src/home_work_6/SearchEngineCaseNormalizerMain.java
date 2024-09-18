package home_work_6;

import home_work_6.api.ISearchEngine;
import home_work_6.search_engines.RegExSearch;
import home_work_6.search_engines.SearchEngineCaseNormalizer;

public class SearchEngineCaseNormalizerMain {
    public static void main(String[] args) {
        String text = "бабушка, бабушку, бабушке бабушкой пробабушка, бабушкафон";
        String word = "бабушка";
        ISearchEngine searchEngine = new SearchEngineCaseNormalizer(new RegExSearch());
        System.out.println(text);
        System.out.println(word + ": " + searchEngine.search(text,word));
        System.out.println("-------------------------------------------");

        text = "поле, полю, поля полчищем";
        word = "поле";
        System.out.println(text);
        System.out.println(word + ": " + searchEngine.search(text,word));
        System.out.println("-------------------------------------------");

        text = "дом, домом, дома, доме, домой, заводом, домашний";
        word = "дом";
        System.out.println(text);
        System.out.println(word + ": " + searchEngine.search(text,word));
        System.out.println("-------------------------------------------");

        text = "Ян, Яном, Яна, Яну, Янина";
        word = "Ян";
        System.out.println(text);
        System.out.println(word + ": " + searchEngine.search(text,word));
    }
}
