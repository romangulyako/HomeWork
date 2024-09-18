package home_work_6.search_engines;

import home_work_6.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        int count = 0;
        int currentIndex = 0;

        int wordLength = word.length();
        int textLength = text.length();

        while ((currentIndex = text.indexOf(word,currentIndex)) != -1) {
            boolean isStartBound = (currentIndex == 0 ||
                    (!Character.isLetterOrDigit(text.charAt(currentIndex - 1))
                            && text.charAt(currentIndex - 1) != '-'));
            boolean isEndBound = (currentIndex + wordLength == textLength ||
                    (!Character.isLetterOrDigit(text.charAt(currentIndex + wordLength))
                            && text.charAt(currentIndex + wordLength) != '-'));

            if (isStartBound && isEndBound) {
                count++;
            }

            currentIndex += wordLength;
        }

        return count;
    }
}
