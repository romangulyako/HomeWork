package home_work_6;

import home_work_6.api.ITextHandler;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class BookHandlerMain {
    public static void main(String[] args) throws IOException {
        ITextHandler handler = new BookHandler("Война и мир_книга.txt");

        long countUsedWords = handler.getCountUsedWords();
        System.out.println("В книге используется " + countUsedWords + " слов");

        int countTopWords = 50;
        List<Map.Entry<String,Integer>> topWords = handler.getTopWordsByUsage(countTopWords);

        System.out.println("Топ-" + countTopWords + " слов по количеству использований в книге:");
        for (Map.Entry<String, Integer> word : topWords) {
            System.out.println("Слово \"" + word.getKey() + "\" встречается " + word.getValue() + " раз");
        }
    }
}
