package home_work_6.search_engines;

import home_work_6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        String regex = "\\b" + Pattern.quote(word) +"\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }
}
