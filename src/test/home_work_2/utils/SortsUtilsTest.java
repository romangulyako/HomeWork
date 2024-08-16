package test.home_work_2.utils;

import home_work_2.utils.SortsUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SortsUtilsTest {
    int[] randomArray = {5,4,-8,6,0,85,41,-9};
    int[] emptyArray = new int[0];
    int[] nullArray = null;

    @Test
    public void sortRandomArrayTest() {
        int[] result = {-9,-8,0,4,5,6,41,85};
        assertArrayEquals(result, SortsUtils.sort(randomArray));
    }

    @Test
    public void sortEmptyArrayTest() {
        int[] result = new int[0];
        assertArrayEquals(result, SortsUtils.sort(emptyArray));
    }

    @Test
    public void sortNullArrayTest() {
        assertThrows(NullPointerException.class, () -> {
            SortsUtils.sort(nullArray);
        });
    }

    @Test
    public void shakeRandomArrayTest() {
        int[] result = {-9,-8,0,4,5,6,41,85};
        assertArrayEquals(result, SortsUtils.shake(randomArray));
    }

    @Test
    public void shakeEmptyArrayTest() {
        int[] result = new int[0];
        assertArrayEquals(result, SortsUtils.shake(emptyArray));
    }

    @Test
    public void shakeNullArrayTest() {
        assertThrows(NullPointerException.class, () -> {
            SortsUtils.shake(nullArray);
        });
    }
}
