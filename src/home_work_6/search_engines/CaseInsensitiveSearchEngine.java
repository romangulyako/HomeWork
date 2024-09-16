package home_work_6.search_engines;

import home_work_6.api.ISearchEngine;

public class CaseInsensitiveSearchEngine implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public CaseInsensitiveSearchEngine(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        if (searchEngine instanceof RegExSearch) {
            ((RegExSearch) searchEngine).caseInsensitive();
        } else {
            text = text.toLowerCase();
            word = word.toLowerCase();
        }

        return this.searchEngine.search(text,word);
    }
}
