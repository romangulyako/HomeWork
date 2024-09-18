package home_work_6.search_engines;

import home_work_6.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        text = text.replaceAll("([.,!?:;\\s\\n\\r\"']|( - ))+"," ");
        return this.searchEngine.search(text,word);
    }
}
