package test.home_work_4.comparators;

import home_work_4.comparators.StringAlphabeticComparator;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

public class StringAlphabeticComparatorTest {
    private final Comparator<String> cmp = new StringAlphabeticComparator();
    @Test
    public void compareNormalTest() {
        String o1 = "abc";
        String o2 = "cba";

        assertTrue(cmp.compare(o1,o2) < 0);

        o1 = "cba";
        o2 = "abc";

        assertTrue(cmp.compare(o1,o2) > 0);

        o1 = "abc";
        o2 = "abc";

        assertEquals(0, cmp.compare(o1, o2));
    }

    @Test
    public void compareWithNullArgumentTest() {
        String o1 = "abc";
        String o2 = null;

        assertThrows(NullPointerException.class, () -> {
            cmp.compare(o1,o2);
        });
    }
}
