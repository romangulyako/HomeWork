package test.home_work_5.generators;

import home_work_5.exceptions.NumberFromRangeException;
import home_work_5.generators.RandomStringGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomStringGeneratorTest {
    @Test
    public void stringLengthTest() {
        int minLength = 5;
        int maxLength = 10;
        String row = new RandomStringGenerator(minLength,maxLength).generate();

        assertTrue(row.length() >= minLength && row.length() <= maxLength);
    }

    @Test
    public void minMoreMaxErrorTest() {
        int minLength = 10;
        int maxLength = 5;

        assertThrows(NumberFromRangeException.class, () -> new RandomStringGenerator(minLength,maxLength));
    }

    @Test
    public void minLessZeroErrorTest() {
        int minLength = -5;
        int maxLength = 5;

        assertThrows(NumberFromRangeException.class, () -> new RandomStringGenerator(minLength,maxLength));
    }
}
