package test.home_work_4;

import home_work_4.DataContainer;
import home_work_4.comparators.IntegerComparator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class DataContainerIntegerTest {
    private final Integer[] arrayWithNull = {1,2,3,null,5};
    private final Integer[] arrayWithoutNull = {1,2,3,4,5};

    @Test
    public void addItemToContainerWithNullCellsTest() {
        DataContainer<Integer> container = new DataContainer<>(arrayWithNull);
        int indexResult = 3;
        assertEquals(indexResult,container.add(4));
    }

    @Test
    public void addItemToContainerWithoutNullCellsTest() {
        DataContainer<Integer> container = new DataContainer<>(arrayWithoutNull);
        int indexResult = 5;
        assertEquals(indexResult,container.add(6));
    }

    @Test
    public void addNullItemToContainerTest() {
        DataContainer<Integer> container = new DataContainer<>(arrayWithoutNull);
        int indexResult = -1;
        assertEquals(indexResult,container.add(null));
    }

    @Test
    public void getNormalTest() {
        DataContainer<Integer> container = new DataContainer<>(arrayWithoutNull);
        Integer result = 3;
        assertEquals(result, container.get(2));
    }

    @Test
    public void getNullTest() {
        DataContainer<Integer> container = new DataContainer<>(arrayWithoutNull);
        assertNull(container.get(20));
    }

    @Test
    public void getItemsTest() {
        DataContainer<Integer> container = new DataContainer<>(arrayWithoutNull);
        Integer[] result = {1,2,3,4,5};
        Integer[] items = container.getItems();
        for (int i = 0; i < items.length; i++) {
            assertEquals(result[i],items[i]);
        }
    }

    @DisplayName("Тестирование удаления элемента коллекции (int index, boolean result)")
    @ParameterizedTest
    @CsvSource({
            "2, true",
            "15, false"
    })
    public void deleteByIndexTest(int index, boolean result) {
        DataContainer<Integer> container = new DataContainer<>(arrayWithoutNull);
        assertEquals(result,container.delete(index));
    }

    @DisplayName("Тестирование изменения размера коллекции после удаления элемента (int index, int size)")
    @ParameterizedTest
    @CsvSource({
            "2, 4",
            "15, 5"
    })
    public void sizeAfterDeleteTest(int index, int result) {
        DataContainer<Integer> container = new DataContainer<>(arrayWithoutNull);
        container.delete(index);
        assertEquals(result, container.getItems().length);
    }

    @Test
    public void deleteByItemFoundTest() {
        DataContainer<Integer> container = new DataContainer<>(arrayWithoutNull);
        assertTrue(container.delete(Integer.valueOf(3)));
        assertFalse(container.delete(Integer.valueOf(15)));
        assertFalse(container.delete(null));
    }

    @Test
    public void sortTest() {
        Integer[] notSortedArray = {5,3,2,4,1};
        DataContainer<Integer> container = new DataContainer<>(notSortedArray);
        String result = "[1, 2, 3, 4, 5]";
        container.sort(new IntegerComparator());
        assertEquals(result, container.toString());
    }
}
