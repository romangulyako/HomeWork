package test.home_work_2.arrays_test;

import home_work_2.arrays.ArraysTasks;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArraysTasksTest {
    int[] randomArray = {45, 4, 2, 45, -1, 456, 0, -65, 12, 454, 6, -8, -5, 1};
    int[] positiveArray = {45, 4, 2, 45, 1, 456, 0, 65, 12, 454, 6, 8, 5, 1};
    int[] negativeArray = {-45, -4, -2, -45, -1, -456, 0, -65, -12, -454, -6, -8, -5, -1};
    int[] emptyArray = new int[0];
    int[] nullArray = null;

    @Test
    public void sumOfEvenPositiveElementsTest() {
        int result = 934;
        assertEquals(result, ArraysTasks.sumOfEvenPositiveElements(randomArray));

        result = 942;
        assertEquals(result, ArraysTasks.sumOfEvenPositiveElements(positiveArray));

        result = 0;
        assertEquals(result, ArraysTasks.sumOfEvenPositiveElements(negativeArray));

        assertEquals(result, ArraysTasks.sumOfEvenPositiveElements(emptyArray));

        assertThrows(NullPointerException.class, () -> {
            ArraysTasks.sumOfEvenPositiveElements(nullArray);
        });
    }

    @Test
    public void maxElementWithEvenIndexTest() {
        int result = 45;
        assertEquals(result, ArraysTasks.maxElementWithEvenIndex(randomArray));

        assertEquals(result, ArraysTasks.maxElementWithEvenIndex(positiveArray));

        result = 0;
        assertEquals(result, ArraysTasks.maxElementWithEvenIndex(negativeArray));

        result = -1;
        assertEquals(result, ArraysTasks.maxElementWithEvenIndex(emptyArray));

        assertThrows(NullPointerException.class, () -> {
            ArraysTasks.maxElementWithEvenIndex(nullArray);
        });
    }

    @Test
    public void elementsLessThanAverageTest() {
        String result = "45 4 2 45 -1 0 -65 12 6 -8 -5 1";
        assertEquals(result,ArraysTasks.elementsLessThanAverage(randomArray));

        result = "45 4 2 45 1 0 65 12 6 8 5 1";
        assertEquals(result,ArraysTasks.elementsLessThanAverage(positiveArray));

        result = "-456 -454";
        assertEquals(result,ArraysTasks.elementsLessThanAverage(negativeArray));

        result = "";
        assertEquals(result,ArraysTasks.elementsLessThanAverage(emptyArray));

        assertThrows(NullPointerException.class, () -> {
            ArraysTasks.elementsLessThanAverage(nullArray);
        });
    }

    @Test
    public void twoMinimalElementsTest() {
        int[] resultArray = {-65, -8};
        boolean result = Arrays.equals(resultArray,ArraysTasks.twoMinimalElements(randomArray));
        assertTrue(result);

        resultArray = new int[]{0, 1};
        result = Arrays.equals(resultArray,ArraysTasks.twoMinimalElements(positiveArray));
        assertTrue(result);

        resultArray = new int[]{-456, -454};
        result = Arrays.equals(resultArray,ArraysTasks.twoMinimalElements(negativeArray));
        assertTrue(result);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            ArraysTasks.twoMinimalElements(emptyArray);
        });

        assertThrows(NullPointerException.class, () -> {
            ArraysTasks.twoMinimalElements(nullArray);
        });
    }

    @Test
    public void compressArray() {
        int start = -8;
        int end = 45;

        int[] resultArray = {456, -65, 454, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        boolean result = Arrays.equals(resultArray, ArraysTasks.compressArray(randomArray, start, end));
        assertTrue(result);

        start = Integer.MIN_VALUE;
        end = Integer.MAX_VALUE;
        resultArray = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        result = Arrays.equals(resultArray, ArraysTasks.compressArray(randomArray, start, end));
        assertTrue(result);

        start = -1000;
        end = -500;
        resultArray = new int[]{45, 4, 2, 45, -1, 456, -65, 12, 454, 6, -8, -5, 1, 0};;
        result = Arrays.equals(resultArray, ArraysTasks.compressArray(randomArray, start, end));
        assertTrue(result);
    }

    @Test
    public void digitsSumTest() {
        int result = 87;
        assertEquals(result,ArraysTasks.digitsSum(randomArray));

        result = 0;
        assertEquals(result,ArraysTasks.digitsSum(emptyArray));

        assertThrows(NullPointerException.class, () -> {
            ArraysTasks.digitsSum(nullArray);
        });
    }
}
