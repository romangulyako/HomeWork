package test.home_work_5.comparators;

import home_work_5.comparators.AgeOfAnimalComparator;
import home_work_5.dto.Animal;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AgeOfAnimalComparatorTest {
    private final Comparator<Animal> cmp = new AgeOfAnimalComparator();

    @Test
    public void compareNormalTest() {
        Animal a1 = new Animal(5,"Tuzik");
        Animal a2 = new Animal(2, "Bobik");
        int result = 3;

        assertEquals(result,cmp.compare(a1,a2));

        a1 = new Animal(2,"Tuzik");
        a2 = new Animal(5, "Bobik");
        result = -3;

        assertEquals(result, cmp.compare(a1,a2));

        a1 = new Animal(5,"Tuzik");
        a2 = new Animal(5, "Bobik");
        result = 0;

        assertEquals(result, cmp.compare(a1,a2));
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
