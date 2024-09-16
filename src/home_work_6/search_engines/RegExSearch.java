package home_work_6.search_engines;

import home_work_6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    private boolean isCaseInsensitive = false;

    public void caseInsensitive() {
        isCaseInsensitive = true;
    }

    @Override
    public long search(String text, String word) {
        String regex = "\\b(?<!-)" + Pattern.quote(word) +"(?<!-)\\b";
        Pattern pattern;
        if (isCaseInsensitive) {
            pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CHARACTER_CLASS);
        } else {
            pattern = Pattern.compile(regex);
        }
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }
}
