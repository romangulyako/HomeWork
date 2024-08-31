package home_work_5.generators;

import home_work_5.api.IGenerator;
import home_work_5.exceptions.NumberFromRangeException;

import java.util.Random;

public class RandomStringGenerator implements IGenerator {

    private final int minLength;
    private final int maxLength;
    private final Random rnd = new Random();

    public RandomStringGenerator(int minLength, int maxLength) {
        NumberFromRangeException.checkCompareMinAndMax(minLength,maxLength);
        NumberFromRangeException.checkPositiveMin(minLength);

        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    @Override
    public String generate() {
        StringBuilder nameBuilder = new StringBuilder();
        int length = minLength + rnd.nextInt(maxLength - minLength + 1);
        int utf8Size = 1_114_112;

        for (int i = 0; i < length; i++) {
            nameBuilder.append((char)rnd.nextInt(utf8Size));
        }

        return nameBuilder.toString();
    }
}
