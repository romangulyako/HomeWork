package home_work_2.utils;

public class SortsUtils {
    // Метод сортировки массива с помощью алгоритма пузырьковой сортировки
    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    // Метод сортировки массива с помощью алгоритма шейкерная сортировка
    public static void shake(int[] array) {
        int left = 0, right = array.length - 1;
        boolean isMoved = true;

        while ((left < right) && isMoved)
        {
            isMoved = false;
            for (int i = left; i < right; i++)
            {
                if (array[i] > array[i+1])
                {
                    int tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                    isMoved = true;
                }
            }
            right--;

            for (int i = right; i > left; i--)
            {
                if (array[i-1] > array[i])
                {
                    int tmp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = tmp;
                    isMoved = true;
                }
            }
            left++;
        }
    }
}
