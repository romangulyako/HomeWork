package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation {
    public String printToConsole(int[] array) {
        StringBuilder builder = new StringBuilder();

        if(array != null && array.length != 0) {
            builder.append("Печать всех элементов массива (foreach)\n");
            int i = 0;
            for(int value : array) {
                builder.append(value);
                if (i < array.length - 1) {
                    builder.append(", ");
                }
                i++;
            }
        }

        return builder.toString();
    }

    public String printEverySecondElementOfArray(int[] array) {
        StringBuilder builder = new StringBuilder();

        if(array != null && array.length != 0) {
            builder.append("Печать каждого второго элемента массива (foreach)\n");
            int i = 0;
            for(int value : array) {
                if (i % 2 == 0) {
                    builder.append(value);
                    if (i < array.length - 2) {
                        builder.append(", ");
                    }
                }
                i++;
            }
        }

        return builder.toString();
    }

    public String reversePrinting(int[] array) {
        StringBuilder builder = new StringBuilder();

        if(array != null && array.length != 0) {
            builder.append("Печать массива наоборот (foreach)\n");
            int[] reverseArray = new int[array.length];
            int i = array.length - 1;
            for(int value : reverseArray) {
                value = array[i];
                builder.append(value);
                if (i > 0) {
                    builder.append(", ");
                }
                i--;
            }
        }

        return builder.toString();
    }
}