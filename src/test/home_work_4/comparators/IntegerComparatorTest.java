package test.home_work_4.comparators;

import home_work_4.comparators.IntegerComparator;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntegerComparatorTest {
    private final Comparator<Integer> cmp = new IntegerComparator();
    @Test
    public void compareNormalTest() {
        Integer o1 = 5;
        Integer o2 = 3;
        int result = 2;

        assertEquals(result,cmp.compare(o1,o2));

        o1 = 3;
        o2 = 5;
        result = -2;

        assertEquals(result, cmp.compare(o1,o2));

        o1 = 3;
        o2 = 3;
        result = 0;

        assertEquals(result, cmp.compare(o1,o2));
    }

    @Test
    public void compareWithNullArgumentTest() {
        Integer o1 = 5;
        Integer o2 = null;

        assertThrows(NullPointerException.class, () -> {
            cmp.compare(o1,o2);
        });
    }
}
