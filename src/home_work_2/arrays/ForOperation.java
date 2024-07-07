package home_work_2.arrays;

public class ForOperation implements IArraysOperation {
    public String printToConsole(int[] array) {
        StringBuilder builder = new StringBuilder();

        builder.append("Печать всех элементов массива (for)\n");
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if (i < array.length - 1) {
                builder.append(", ");
            }
        }

        return builder.toString();
    }

    public String printEverySecondElementOfArray(int[] array) {
        StringBuilder builder = new StringBuilder();

        builder.append("Печать каждого второго элемента массива (for)\n");
        for (int i = 0; i < array.length; i+=2) {
            builder.append(array[i]);
            if (i < array.length - 2) {
                builder.append(", ");
            }
        }

        return builder.toString();
    }

    public String reversePrinting(int[] array) {
        StringBuilder builder = new StringBuilder();

        builder.append("Печать массива наоборот (for)\n");
        for (int i = array.length - 1; i >= 0; i--) {
            builder.append(array[i]);
            if (i > 0) {
                builder.append(", ");
            }
        }

        return builder.toString();
    }
}
