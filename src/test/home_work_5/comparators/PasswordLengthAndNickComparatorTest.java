package test.home_work_5.comparators;

import home_work_5.comparators.PasswordLengthAndNickComparator;
import home_work_5.dto.Person;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordLengthAndNickComparatorTest {
    private final Comparator<Person> cmp = new PasswordLengthAndNickComparator();

    @Test
    public void compareNormalTest() {
        Person p1 = new Person("nick1", "12345", "Name1");
        Person p2 = new Person("nick2", "12345", "Name2");

        assertTrue(cmp.compare(p1,p2) < 0);

        p1 = new Person("nick2", "12345", "Name2");
        p2 = new Person("nick1", "12345", "Name1");

        assertTrue(cmp.compare(p1,p2) > 0);

        p1 = new Person("nick1", "12345", "Name1");
        p2 = new Person("nick1", "12345", "Name1");

        assertEquals(0, cmp.compare(p1,p2));
    }

    @Test
    public void compareWithNullArgumentTest() {
        Person p1 = new Person("nick1", "12345", "Name1");
        Person p2 = null;

        assertThrows(NullPointerException.class, () -> {
            cmp.compare(p1,p2);
        });
    }
}
