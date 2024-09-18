package home_work_6.search_engines;

import home_work_6.api.ISearchEngine;

public class SearchEngineCaseNormalizer implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEngineCaseNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        String endings = "(ей|ой|ом|ем|а|я|ы|и|е|о|у|ю)";
        String wordWithoutEnding = word;

        if (word.length() > 3) {
            wordWithoutEnding = word.replaceAll("([А-Яа-яЁё]+)"+ endings + "+$", "$1");
        }
        text = text.replaceAll(wordWithoutEnding + endings, wordWithoutEnding);

        return searchEngine.search(text,wordWithoutEnding);
    }
}
