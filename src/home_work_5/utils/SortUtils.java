package home_work_5.utils;

import home_work_5.exceptions.NullArgumentException;

import java.util.Comparator;

public class SortUtils<T> {
    private final Comparator<T> comparator;

    public SortUtils(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    /**
     * Метод сортировки массива пузырьком
     *
     * @param array массив, который нужно отсортировать
     * @throws NullArgumentException если массив равен null
     */
    public void bubbleSort(T[] array) {
        NullArgumentException.check(array);

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (comparator.compare(array[i],array[j]) > 0) {
                    T tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    /**
     * Метод шейкерной сортировки массива
     *
     * @param array массив, который нужно отсортировать
     * @throws NullArgumentException если массив равен null
     */
    public void shakerSort(T[] array) {
        NullArgumentException.check(array);

        int left = 0, right = array.length - 1;
        boolean isMoved = true;

        while ((left < right) && isMoved)
        {
            isMoved = false;
            for (int i = left; i < right; i++)
            {
                if (comparator.compare(array[i],array[i + 1]) > 0)
                {
                    T tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                    isMoved = true;
                }
            }
            right--;

            for (int i = right; i > left; i--)
            {
                if (comparator.compare(array[i - 1],array[i]) > 0)
                {
                    T tmp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = tmp;
                    isMoved = true;
                }
            }
            left++;
        }
    }

    /**
     * Метод быстрой сортировки массива
     *
     * @param array массив, который нужно отсортировать
     * @throws NullArgumentException если массив равен null
     */
    public void quickSort(T[] array, int first, int last) {
        NullArgumentException.check(array);

        if (first < last) {
            int pi = partition(array, first, last);

            quickSort(array, first, pi -1);
            quickSort(array, pi + 1, last);
        }
    }

    private int partition(T[] array, int first, int last) {
        T pivot = array[last];
        int i = first - 1;

        for (int j = first; j < last; j++) {
            if (comparator.compare(pivot, array[j]) > 0) {
                i++;

                T tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }

        T tmp = array[i + 1];
        array[i + 1] = array[last];
        array[last] = tmp;

        return i + 1;
    }
}
