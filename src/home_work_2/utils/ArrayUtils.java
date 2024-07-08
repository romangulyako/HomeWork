package home_work_2.utils;

import java.util.Random;

public class ArrayUtils {
    // метод для вывода в строку одномерного массива
    public static String arrayToString(int[] oneDimensionalArray) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < oneDimensionalArray.length; i++) {
            builder.append(oneDimensionalArray[i]);
            if (i < oneDimensionalArray.length - 1) {
                builder.append(", ");
            }
        }

        return builder.toString();
    }

    // Метод возвращает массив, размер и значения элементов которого введены с консоли
    public static int[] arrayFromConsole() {
        System.out.print("Введите размер массива: ");
        int size = Integer.parseInt(ConsoleUtils.inputFromConsole());
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("значение " + i + "-го элемента массива: ");
            array[i] = Integer.parseInt(ConsoleUtils.inputFromConsole());
        }

        return array;
    }

    // Метод возвращает массив. Размер передается первым параметром. Заполняется массив рандомными числами от 0 до числа, переданного вторым параметром
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] array = new int[size];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(maxValueExclusion);
        }

        return array;
    }
}
