package home_work_2.utils;

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

    // метод для вывода в строку двумерного массива
    public static String arrayToString(int[][] twoDimensionalArray) {
        StringBuilder builder = new StringBuilder();
        int index = 0;

        for (int[] oneDimensionalArray : twoDimensionalArray) {
            builder.append(arrayToString(oneDimensionalArray));

            if(++index < twoDimensionalArray.length) {
                builder.append("\n");
            }
        }
        return builder.toString();
    }

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
}
