package home_work_2.arrays;

import home_work_2.utils.ArrayUtils;

import java.util.Arrays;

public class ArraysTasks {
    public static void main(String[] args) {
        int[] randomArray = ArrayUtils.arrayRandom(50,100);
        System.out.println("Массив для заданий: " + ArrayUtils.arrayToString(randomArray));
        // По доброму, для этой подзадачи нужно было создать отдельный массив с отрицательными числами в том числе, чтобы точно проверить его работу,
        // потому что метод arrayRandom возвращает массив только положительных чисел
        System.out.println("-------------------------------------------------------");
        System.out.println("Сумма четных положительных элементов массива: " + sumOfEvenPositiveElements(randomArray));

        System.out.println("-------------------------------------------------------");
        System.out.println("Максимальный элемент массива с четным индексом: " + maxElementWithEvenIndex(randomArray));

        System.out.println("-------------------------------------------------------");
        System.out.println("Элементы массива, которые меньше среднего арифметического: " + elementsLessThanAverage(randomArray));

        System.out.println("-------------------------------------------------------");
        System.out.println("Два наименьших элемента массива: " + ArrayUtils.arrayToString(twoMinimalElements(randomArray)));

        System.out.println("-------------------------------------------------------");
        System.out.println("Сжатый массив после удаления чисел, входящих в интервал от 5 до 34: " + ArrayUtils.arrayToString(compressArray(randomArray,5,34)));

        System.out.println("-------------------------------------------------------");
        System.out.println("Сумма цифр массива: " + DigitsSum(randomArray));

    }

    // Метод для подсчета суммы четных положительных элементов массива
    public static int sumOfEvenPositiveElements(int[] array) {
        int sum = 0;

        for (int value : array) {
            if (value > 0 && value % 2 == 0) {
                sum += value;
            }
        }

        return sum;
    }

    // Метод для поиска максимального элемента массива с четным индексом
    public static int maxElementWithEvenIndex(int[] array) {
        int maxElement = -1;

        for (int i = 0; i < array.length; i+=2) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }

        return maxElement;
    }

    // Метод для поиска элементов массива, которые меньше среднего арифметического всех элементов массива
    public static String elementsLessThanAverage (int[] array) {
        StringBuilder builder = new StringBuilder();
        int sum = 0;
        double average ;

        for (int value : array) {
            sum += value;
        }
        average = 1.0 * sum / array.length;

        for (int value : array) {
            if (value < average) {
                builder.append(value);
                builder.append(" ");
            }
        }

        return builder.toString().trim();
    }

    // Метод для поиска двух минимальных элементов массива
    public static int[] twoMinimalElements(int[] array) {
        int[] tmpArray = Arrays.copyOf(array,array.length);
        int[] minimalElements = new int[2];
        for (int i = 0; i < tmpArray.length - 1; i++) {
            for (int j = i + 1; j < tmpArray.length; j++) {
                if (tmpArray[i] > tmpArray[j]) {
                    int tmp = tmpArray[i];
                    tmpArray[i] = tmpArray[j];
                    tmpArray[j] = tmp;
                }
            }
        }

        minimalElements[0] = tmpArray[0];
        minimalElements[1] = tmpArray[1];

        return minimalElements;
    }

    // Метод для сжатия массива, удалив элементы, принадлежащие интервалу
    public static int[] compressArray(int[] array, int startInterval, int endInterval) {
        int[] tmpArray = Arrays.copyOf(array,array.length);
        for (int i = 0; i < tmpArray.length; i++) {
            if(tmpArray[i] >= startInterval && tmpArray[i] <= endInterval) {
                tmpArray[i] = 0;
            }
        }

        for (int i = 0; i < tmpArray.length - 1; i++) {
            for (int j = i + 1; j < tmpArray.length; j++) {
                if (tmpArray[i] == 0) {
                    int tmp = tmpArray[i];
                    tmpArray[i] = tmpArray[j];
                    tmpArray[j] = tmp;
                }
            }
        }

        return tmpArray;
    }

    // Метод для подсчета суммы всех цифр массива
    public static int DigitsSum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            while (array[i] > 0) {
                sum += array[i] % 10;
                array[i] /= 10;
            }
        }

        return sum;
    }
}
