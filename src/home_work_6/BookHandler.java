package home_work_6;

import home_work_6.api.ITextHandler;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookHandler implements ITextHandler {
    private final String text;

    public BookHandler(String path) {
        this.text = read(path);
    }

    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public Set<String> getUsedWords() {
        return new HashSet<>(splitText());
    }

    @Override
    public long getCountUsedWords() {
        return getUsedWords().size();
    }

    @Override
    public Map<String, Integer> getWordsAndTheirCount() {
        List<String> allWords = splitText();
        Map<String,Integer> words = new HashMap<>();

        for (String word : allWords) {
            Integer value = words.get(word);
            if (value == null) {
                value = 0;
            }
            words.put(word, ++value);
        }
        return words;
    }

    @Override
    public List<Map.Entry<String,Integer>> getSortedWordsByUsage() {
        Map<String, Integer> words = getWordsAndTheirCount();
        List<Map.Entry<String, Integer>> sortedListOfWords = new ArrayList<>(words.entrySet());

        sortedListOfWords.sort((o1,o2) -> o2.getValue().compareTo(o1.getValue()));

        return sortedListOfWords;
    }

    @Override
    public List<Map.Entry<String, Integer>> getTopWordsByUsage(int count) {
        return getSortedWordsByUsage().subList(0,count);
    }

    private String read(String path) {
        StringBuilder text = new StringBuilder();

        File file = new File(path);

        if (file.exists() && file.isFile()) {
            try (Reader reader = new FileReader(file)) {
                int symbol;

                while ((symbol = reader.read()) != -1) {
                    text.append((char) symbol);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new IllegalArgumentException("Возможно путь к файлу неверный или это не файл");
        }

        return text.toString();
    }

    private List<String> splitText() {
        String regEx = "\\b[А-Яа-яЁёA-Za-z\\d]+(-[А-Яа-яЁёA-Za-z\\d])*\\b";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(this.text);

        List<String> allWords = new ArrayList<>();

        int startIndex = 0;
        while (matcher.find(startIndex)) {
            String word = this.text.substring(matcher.start(), (startIndex = matcher.end()));
            allWords.add(word);
        }

        return allWords;
    }
}
