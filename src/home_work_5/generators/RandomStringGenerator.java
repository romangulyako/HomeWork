package home_work_5.generators;

import home_work_5.api.IGenerator;

import java.util.Random;

public class RandomStringGenerator implements IGenerator {

    private final int minLength;
    private final int maxLength;
    private final Random rnd = new Random();

    public RandomStringGenerator(int minLength, int maxLength) {
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    @Override
    public String generate() {
        StringBuilder nameBuilder = new StringBuilder();
        int length = minLength + rnd.nextInt(maxLength - minLength + 1);
        int utf8Size = 1_114_112;

        if (length > 0) {
            for (int i = 0; i < length; i++) {
                nameBuilder.append((char)rnd.nextInt(utf8Size));
            }

            return nameBuilder.toString();
        } else {
            throw new IllegalArgumentException("Длина строки должна быть минимум 1 символ");
        }
    }
}
