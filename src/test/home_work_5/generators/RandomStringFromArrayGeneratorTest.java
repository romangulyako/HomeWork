package test.home_work_5.generators;

import home_work_5.exceptions.NullArgumentException;
import home_work_5.generators.RandomStringFromArrayGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class RandomStringFromArrayGeneratorTest {
    @Test
    public void nullArrayTest() {
        assertThrows(NullArgumentException.class, () -> new RandomStringFromArrayGenerator(null));
    }
}
