package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArraysIteration {
    public static void main(String[] args) {
        int[] array = ArraysUtils.arrayFromConsole();

        System.out.println(printToConsole(array));
        System.out.println("-------------------------------------");
        System.out.println(printEverySecondElementOfArray(array));
        System.out.println("-------------------------------------");
        System.out.println(reversePrinting(array));
    }

    // Метод для вывода всех элементов массива в консоль с помощью 4-х разных циклов
    public static String printToConsole(int[] array) {
        StringBuilder builder = new StringBuilder();

        builder.append("Печать с помощью do...while\n");
        int i = 0;
        do {
            builder.append(array[i]);
            if (i < array.length - 1) {
                builder.append(", ");
            }
            i++;
        } while(i < array.length);

        builder.append("\nПечать с помощью while\n");
        i = 0;
        while (i < array.length) {
            builder.append(array[i]);
            if (i < array.length - 1) {
                builder.append(", ");
            }
            i++;
        }

        builder.append("\nПечать с помощью for\n");
        for (i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if (i < array.length - 1) {
                builder.append(", ");
            }
        }

        builder.append("\nПечать с помощью foreach\n");
        i = 0;
        for(int value : array) {
            builder.append(value);
            if (i < array.length - 1) {
                builder.append(", ");
            }
            i++;
        }

        return builder.toString();
    }

    // Метод для вывода каждого второго элемента массива в консоль с помощью 4-х разных циклов
    public static String printEverySecondElementOfArray(int[] array) {
        StringBuilder builder = new StringBuilder();

        builder.append("Печать с помощью do...while\n");
        int i = 0;
        do {
            builder.append(array[i]);
            if (i < array.length - 2) {
                builder.append(", ");
            }
            i+=2;
        } while(i < array.length);

        builder.append("\nПечать с помощью while\n");
        i = 0;
        while (i < array.length) {
            builder.append(array[i]);
            if (i < array.length - 2) {
                builder.append(", ");
            }
            i+=2;
        }

        builder.append("\nПечать с помощью for\n");
        for (i = 0; i < array.length; i+=2) {
            builder.append(array[i]);
            if (i < array.length - 2) {
                builder.append(", ");
            }
        }

        builder.append("\nПечать с помощью foreach\n");
        i = 0;
        for(int value : array) {
            if (i % 2 == 0) {
                builder.append(value);
                if (i < array.length - 2) {
                    builder.append(", ");
                }
            }
            i++;
        }

        return builder.toString();
    }

    // Метод для вывода всех элементов массива в консоль в обратном порядке с помощью 4-х разных циклов
    public static String reversePrinting(int[] array) {
        StringBuilder builder = new StringBuilder();

        builder.append("Печать с помощью do...while\n");
        int i = array.length - 1;
        do {
            builder.append(array[i]);
            if (i > 0) {
                builder.append(", ");
            }
            i--;
        } while(i >= 0);

        builder.append("\nПечать с помощью while\n");
        i = array.length - 1;
        while (i >= 0) {
            builder.append(array[i]);
            if (i > 0) {
                builder.append(", ");
            }
            i--;
        }

        builder.append("\nПечать с помощью for\n");
        for (i = array.length - 1; i >= 0; i--) {
            builder.append(array[i]);
            if (i > 0) {
                builder.append(", ");
            }
        }

        builder.append("\nПечать с помощью foreach\n");
        int[] reverseArray = new int[array.length];
        i = array.length - 1;
        for(int value : reverseArray) {
            value = array[i];
            builder.append(value);
            if (i > 0) {
                builder.append(", ");
            }
            i--;
        }

        return builder.toString();
    }
}
