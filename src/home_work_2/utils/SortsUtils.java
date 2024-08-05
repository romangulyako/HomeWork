package home_work_2.utils;

import java.util.Arrays;

public class SortsUtils {
    // Метод сортировки массива с помощью алгоритма пузырьковой сортировки
    public static int[] sort(int[] array) {
        int[] sortedArray = Arrays.copyOf(array,array.length);

        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[i] > sortedArray[j]) {
                    int tmp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = tmp;
                }
            }
        }

        return sortedArray;
    }

    // Метод сортировки массива с помощью алгоритма шейкерная сортировка
    public static int[] shake(int[] array) {
        int[] sortedArray = Arrays.copyOf(array,array.length);

        int left = 0, right = sortedArray.length - 1;
        boolean isMoved = true;

        while ((left < right) && isMoved)
        {
            isMoved = false;
            for (int i = left; i < right; i++)
            {
                if (sortedArray[i] > sortedArray[i+1])
                {
                    int tmp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = tmp;
                    isMoved = true;
                }
            }
            right--;

            for (int i = right; i > left; i--)
            {
                if (sortedArray[i-1] > sortedArray[i])
                {
                    int tmp = sortedArray[i];
                    sortedArray[i] = sortedArray[i-1];
                    sortedArray[i-1] = tmp;
                    isMoved = true;
                }
            }
            left++;
        }

        return sortedArray;
    }
}
