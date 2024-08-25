package home_work_5.generators;

import home_work_5.Alphabet;
import home_work_5.api.IGenerator;

import java.util.Random;

public class RandomStringInLanguageGenerator implements IGenerator {

    private final int length;
    private final Alphabet language;

    public RandomStringInLanguageGenerator(int length, Alphabet language) {
        this.length = length;
        this.language = language;

    }

    @Override
    public String generate() {
        Random rnd = new Random();
        StringBuilder nameBuilder = new StringBuilder();

        char[] allLettersOfAlphabet = new char[language.getSize() * 2];

        for (int i = 0; i < language.getSize(); i++) {
            allLettersOfAlphabet[i] = (char) (language.getStartUpperLetter() + i);
            allLettersOfAlphabet[language.getSize() + i] = (char) (language.getStartLowerLetter() + i);
        }

        if (length > 0) {
            for (int i = 0; i < length; i++) {
                nameBuilder.append(allLettersOfAlphabet[rnd.nextInt(allLettersOfAlphabet.length)]);
            }

            return nameBuilder.toString();
        } else {
            throw new IllegalArgumentException("Длина строки должна быть минимум 1 символ");
        }
    }
}
