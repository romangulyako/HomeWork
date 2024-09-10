package test.home_work_5.generators;

import home_work_5.exceptions.NumberFromRangeException;
import home_work_5.generators.PasswordGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordGeneratorTest {
    @Test
    public void passwordLengthTest() {
        int minLength = 5;
        int maxLength = 10;
        String password = new PasswordGenerator(minLength,maxLength).generate();

        assertTrue(password.length() >= minLength && password.length() <= maxLength);
    }

    @Test
    public void minMoreMaxErrorTest() {
        int minLength = 10;
        int maxLength = 5;
        
        assertThrows(NumberFromRangeException.class, () -> new PasswordGenerator(minLength,maxLength));
    }

    @Test
    public void minLessZeroErrorTest() {
        int minLength = -5;
        int maxLength = 5;

        assertThrows(NumberFromRangeException.class, () -> new PasswordGenerator(minLength,maxLength));
    }
}

