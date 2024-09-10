package test.home_work_5.generators;

import home_work_5.exceptions.NullArgumentException;
import home_work_5.generators.RandomStringFromFileGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class RandomStringFromFileGeneratorTest {
    @Test
    public void nullPathTest() {
        assertThrows(NullArgumentException.class, () -> new RandomStringFromFileGenerator(null));
    }
}
