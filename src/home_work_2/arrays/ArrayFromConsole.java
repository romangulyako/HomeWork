package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArrayFromConsole {
    public static void main(String[] args) {
        int[] array = ArraysUtils.arrayFromConsole();

        System.out.println(ArraysUtils.arrayToString(array));
    }
}
