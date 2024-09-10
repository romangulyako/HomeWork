package test.home_work_5.generators;

import home_work_5.dto.Alphabet;
import home_work_5.exceptions.NullArgumentException;
import home_work_5.exceptions.NumberFromRangeException;
import home_work_5.generators.RandomStringGenerator;
import home_work_5.generators.RandomStringInLanguageGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomStringInLanguageGeneratorTest {
    @Test
    public void stringLengthTest() {
        int minLength = 5;
        int maxLength = 10;
        String row = new RandomStringInLanguageGenerator(minLength,maxLength, Alphabet.EN).generate();

        assertTrue(row.length() >= minLength && row.length() <= maxLength);
    }

    @Test
    public void minMoreMaxErrorTest() {
        int minLength = 10;
        int maxLength = 5;

        assertThrows(NumberFromRangeException.class, () -> new RandomStringInLanguageGenerator(minLength,maxLength, Alphabet.EN));
    }

    @Test
    public void minLessZeroErrorTest() {
        int minLength = -5;
        int maxLength = 5;

        assertThrows(NumberFromRangeException.class, () -> new RandomStringInLanguageGenerator(minLength,maxLength, Alphabet.EN));
    }

    @Test
    public void nullLanguageTest() {
        assertThrows(NullArgumentException.class,
                () -> new RandomStringInLanguageGenerator(5,10,null));
    }
}
