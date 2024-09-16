package home_work_6.api;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ITextHandler {
    Set<String> getUsedWords();
    long getCountUsedWords();
    Map<String, Integer> getWordsAndTheirCount();
    List<Map.Entry<String,Integer>> getSortedWordsByUsage();
    List<Map.Entry<String,Integer>> getTopWordsByUsage(int count);
    String getText();
}
