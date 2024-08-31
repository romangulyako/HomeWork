package home_work_5.generators;

import home_work_5.api.IGenerator;
import home_work_5.exceptions.NumberFromRangeException;

import java.util.Random;

public class PasswordGenerator implements IGenerator {

    private final int minLength;
    private final int maxLength;
    private final Random rnd = new Random();

    public PasswordGenerator(int minLength, int maxLength) {
        NumberFromRangeException.checkCompareMinAndMax(minLength,maxLength);
        NumberFromRangeException.checkPositiveMin(minLength);

        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    @Override
    public String generate() {
        StringBuilder passwordBuilder = new StringBuilder();
        int length = minLength + rnd.nextInt(maxLength - minLength + 1);

        for (int i = 0; i < length; i++) {
            passwordBuilder.append(rnd.nextInt(10));
        }

        return passwordBuilder.toString();
    }
}
