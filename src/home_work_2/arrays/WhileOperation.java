package home_work_2.arrays;

public class WhileOperation implements IArraysOperation {
    public String printToConsole(int[] array) {
        StringBuilder builder = new StringBuilder();

        if(array != null && array.length != 0) {
            builder.append("Печать всех элементов массива (while)\n");
            int i = 0;
            while (i < array.length) {
                builder.append(array[i]);
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
            builder.append("Печать каждого второго элемента массива (while)\n");
            int i = 0;
            while (i < array.length) {
                builder.append(array[i]);
                if (i < array.length - 2) {
                    builder.append(", ");
                }
                i+=2;
            }
        }

        return builder.toString();
    }

    public String reversePrinting(int[] array) {
        StringBuilder builder = new StringBuilder();

        if(array != null && array.length != 0) {
            builder.append("Печать массива наоборот (while)\n");
            int i = array.length - 1;
            while (i >= 0) {
                builder.append(array[i]);
                if (i > 0) {
                    builder.append(", ");
                }
                i--;
            }
        }

        return builder.toString();
    }
}
