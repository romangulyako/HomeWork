package test.home_work_4.comparators;

import home_work_4.comparators.StringLengthComparator;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

public class StringLengthComparatorTest {
    private final Comparator<String> cmp = new StringLengthComparator();
    @Test
    public void compareNormalTest() {
        String o1 = "abcd";
        String o2 = "abc";

        assertTrue(cmp.compare(o1,o2) > 0);

        o1 = "abc";
        o2 = "abcd";

        assertTrue(cmp.compare(o1,o2) < 0);

        o1 = "abc";
        o2 = "abc";

        assertEquals(0, cmp.compare(o1, o2));
    }

    @Test
    public void compareWithNullArgumentTest() {
        String o1 = "abcd";
        String o2 = null;

        assertThrows(NullPointerException.class, () -> {
            cmp.compare(o1,o2);
        });
    }
}
