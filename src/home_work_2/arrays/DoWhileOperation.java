package home_work_2.arrays;

public class DoWhileOperation implements IArraysOperation {
    public String printToConsole(int[] array) {
        StringBuilder builder = new StringBuilder();

        builder.append("Печать всех элементов массива (do while)\n");
        int i = 0;
        do {
            builder.append(array[i]);
            if (i < array.length - 1) {
                builder.append(", ");
            }
            i++;
        } while(i < array.length);

        return builder.toString();
    }

    public String printEverySecondElementOfArray(int[] array) {
        StringBuilder builder = new StringBuilder();

        builder.append("Печать каждого второго элемента массива (do while)\n");
        int i = 0;
        do {
            builder.append(array[i]);
            if (i < array.length - 2) {
                builder.append(", ");
            }
            i+=2;
        } while(i < array.length);

        return builder.toString();
    }

    public String reversePrinting(int[] array) {
        StringBuilder builder = new StringBuilder();

        builder.append("Печать массива наоборот (do while)\n");
        int i = array.length - 1;
        do {
            builder.append(array[i]);
            if (i > 0) {
                builder.append(", ");
            }
            i--;
        } while(i >= 0);

        return builder.toString();
    }
}
