package home_work_2.arrays;

import home_work_2.utils.ArrayUtils;

public class ArrayFromConsole {
    public static void main(String[] args) {
        int[] array = ArrayUtils.arrayFromConsole();

        System.out.println(ArrayUtils.arrayToString(array));
    }
}
