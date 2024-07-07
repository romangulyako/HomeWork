package home_work_2.arrays;

import home_work_2.utils.ArrayUtils;

public class ArrayRandom {
    public static void main(String[] args) {
        int[] array = ArrayUtils.arrayRandom(7,214);

        System.out.println(ArrayUtils.arrayToString(array));
    }
}
