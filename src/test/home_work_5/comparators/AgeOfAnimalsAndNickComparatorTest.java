package test.home_work_5.comparators;

import home_work_5.comparators.AgeOfAnimalsAndNickComparator;
import home_work_5.dto.Animal;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

public class AgeOfAnimalsAndNickComparatorTest {
    private final Comparator<Animal> cmp = new AgeOfAnimalsAndNickComparator();

    @Test
    public void compareNormalTest() {
        Animal a1 = new Animal(5,"Tuzik");
        Animal a2 = new Animal(5, "Bobik");

        assertTrue(cmp.compare(a1,a2) > 0);

        a1 = new Animal(5,"Bobik");
        a2 = new Animal(5, "Tuzik");

        assertTrue(cmp.compare(a1,a2) < 0);

        a1 = new Animal(5,"Tuzik");
        a2 = new Animal(5, "Tuzik");

        assertEquals(0, cmp.compare(a1,a2));
    }

    @Test
    public void compareWithNullArgumentTest() {
        Animal a1 = new Animal(5,"Tuzik");
        Animal a2 = null;

        assertThrows(NullPointerException.class, () -> {
            cmp.compare(a1,a2);
        });
    }
}
