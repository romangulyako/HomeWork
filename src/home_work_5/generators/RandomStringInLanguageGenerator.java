package home_work_5.generators;

import home_work_5.dto.Alphabet;
import home_work_5.api.IGenerator;

import java.util.Random;

public class RandomStringInLanguageGenerator implements IGenerator {

    private final int minLength;
    private final int maxLength;
    private final Alphabet language;

    private final Random rnd = new Random();

    public RandomStringInLanguageGenerator(int minLength, int maxLength, Alphabet language) {
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.language = language;

    }

    @Override
    public String generate() {
        StringBuilder nameBuilder = new StringBuilder();
        int length = minLength + rnd.nextInt(maxLength - minLength + 1);

        char[] alphabet = language.getAlphabet();

        if (length > 0) {
            for (int i = 0; i < length; i++) {
                nameBuilder.append(alphabet[rnd.nextInt(alphabet.length)]);
            }

            return nameBuilder.toString();
        } else {
            throw new IllegalArgumentException("Длина строки должна быть минимум 1 символ");
        }
    }
}
