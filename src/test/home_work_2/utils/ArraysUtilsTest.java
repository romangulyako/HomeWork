package test.home_work_2.utils;

import home_work_2.utils.ArraysUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArraysUtilsTest {
    int[] randomArray = {1,2,3,4,5};
    int[] emptyArray = new int[0];
    int[] nullArray = null;

    @Test
    public void arrayToStringRandomArrayTest() {
        String result = "1, 2, 3, 4, 5";
        assertEquals(result, ArraysUtils.arrayToString(randomArray));
    }

    @Test
    public void arrayToStringEmptyArrayTest() {
        String result = "";
        assertEquals(result, ArraysUtils.arrayToString(emptyArray));
    }

    @Test
    public void arrayToStringNullArrayTest() {
        assertThrows(NullPointerException.class, () -> {
            ArraysUtils.arrayToString(nullArray);
        });
    }

    @Test
    public void arrayRandomNormalSizeTest() {
        int size = 5;
        int[] outputArray = new int[size];

        assertEquals(outputArray.length, ArraysUtils.arrayRandom(size,50).length);
    }

    @Test
    public void arrayRandomEmptySizeTest() {
        int size = 5;
        int[] outputArray = new int[size];

        assertEquals(outputArray.length, ArraysUtils.arrayRandom(size,50).length);
    }

    @Test
    public void arrayRandomNegativeSizeTest() {
        int size =-5;
        assertThrows(NegativeArraySizeException.class, () -> {
            ArraysUtils.arrayRandom(size, 50);
        });
    }

    @Test
    public void arrayRandomMaxValueTest() {
        int size =5;
        int maxValue =  50;
        int[] testArray = ArraysUtils.arrayRandom(size,maxValue);
        for (int i = 0; i < size; i++) {
            assertTrue(testArray[i] >= 0 && testArray[i] < maxValue);
        }
    }
}
