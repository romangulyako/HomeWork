package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArrayRandom {
    public static void main(String[] args) {
        int[] array = ArraysUtils.arrayRandom(7,214);

        System.out.println(ArraysUtils.arrayToString(array));
    }
}
