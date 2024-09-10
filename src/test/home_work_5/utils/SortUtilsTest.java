package test.home_work_5.utils;

import home_work_4.comparators.IntegerComparator;
import home_work_5.exceptions.NullArgumentException;
import home_work_5.utils.SortUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SortUtilsTest {
    private final SortUtils<Integer> integerSorter = new SortUtils<>(new IntegerComparator());

    private final Integer[] notSortedArray = {5,3,1,2,4,8,6,7};
    private final Integer[] sortedArray = {1,2,3,4,5,6,7,8};

    @Test
    public void bubbleSortTest() {
        integerSorter.bubbleSort(notSortedArray);

        assertArrayEquals(sortedArray,notSortedArray);
    }

    @Test
    public void shakerSortTest() {
        integerSorter.shakerSort(notSortedArray);

        assertArrayEquals(sortedArray,notSortedArray);
    }

    @Test
    public void quickSortTest() {
        integerSorter.quickSort(notSortedArray,0,notSortedArray.length-1);

        assertArrayEquals(sortedArray,notSortedArray);
    }

    @Test
    public void nullArraysTest() {
        assertThrows(NullArgumentException.class, () -> integerSorter.bubbleSort(null));
        assertThrows(NullArgumentException.class, () -> integerSorter.shakerSort(null));
        assertThrows(NullArgumentException.class, () -> integerSorter.quickSort(null,0,10));
    }
}
