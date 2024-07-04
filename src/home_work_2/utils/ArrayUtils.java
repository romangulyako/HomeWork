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
}
