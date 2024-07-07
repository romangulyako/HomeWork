package home_work_2.sorts;

import home_work_2.utils.ArrayUtils;
import home_work_2.utils.SortsUtils;

public class SortsMain {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6};
        System.out.println("Массив до сортировки - " + ArrayUtils.arrayToString(array));
        SortsUtils.sort(array);
        System.out.println("Массив после сортировки (пузырьковая) - " + ArrayUtils.arrayToString(array));

        array = new int[]{1,2,3,4,5,6};
        System.out.println("Массив до сортировки - " + ArrayUtils.arrayToString(array));
        SortsUtils.shake(array);
        System.out.println("Массив после сортировки (шейкер) - " + ArrayUtils.arrayToString(array));
        System.out.println("----------------------------------------------------------------------");

        array = new int[]{1,1,1,1};
        System.out.println("Массив до сортировки - " + ArrayUtils.arrayToString(array));
        SortsUtils.sort(array);
        System.out.println("Массив после сортировки (пузырьковая) - " + ArrayUtils.arrayToString(array));

        array = new int[]{1,1,1,1};
        System.out.println("Массив до сортировки - " + ArrayUtils.arrayToString(array));
        SortsUtils.shake(array);
        System.out.println("Массив после сортировки (шейкер) - " + ArrayUtils.arrayToString(array));
        System.out.println("----------------------------------------------------------------------");

        array = new int[]{9,1,5,99,9,9};
        System.out.println("Массив до сортировки - " + ArrayUtils.arrayToString(array));
        SortsUtils.sort(array);
        System.out.println("Массив после сортировки (пузырьковая) - " + ArrayUtils.arrayToString(array));

        array = new int[]{9,1,5,99,9,9};
        System.out.println("Массив до сортировки - " + ArrayUtils.arrayToString(array));
        SortsUtils.shake(array);
        System.out.println("Массив после сортировки (шейкер) - " + ArrayUtils.arrayToString(array));
        System.out.println("----------------------------------------------------------------------");

        array = new int[]{};
        System.out.println("Массив до сортировки - " + ArrayUtils.arrayToString(array));
        SortsUtils.sort(array);
        System.out.println("Массив после сортировки (пузырьковая) - " + ArrayUtils.arrayToString(array));

        array = new int[]{};
        System.out.println("Массив до сортировки - " + ArrayUtils.arrayToString(array));
        SortsUtils.shake(array);
        System.out.println("Массив после сортировки (шейкер) - " + ArrayUtils.arrayToString(array));
        System.out.println("----------------------------------------------------------------------");

        array = new int[]{6,5,4,3,2,1};
        System.out.println("Массив до сортировки - " + ArrayUtils.arrayToString(array));
        SortsUtils.sort(array);
        System.out.println("Массив после сортировки (пузырьковая) - " + ArrayUtils.arrayToString(array));

        array = new int[]{6,5,4,3,2,1};
        System.out.println("Массив до сортировки - " + ArrayUtils.arrayToString(array));
        SortsUtils.shake(array);
        System.out.println("Массив после сортировки (шейкер) - " + ArrayUtils.arrayToString(array));
        System.out.println("----------------------------------------------------------------------");

        array = ArrayUtils.arrayRandom(50, 100);
        System.out.println("Массив до сортировки - " + ArrayUtils.arrayToString(array));
        SortsUtils.sort(array);
        System.out.println("Массив после сортировки (пузырьковая) - " + ArrayUtils.arrayToString(array));

        array = ArrayUtils.arrayRandom(50, 100);
        System.out.println("Массив до сортировки - " + ArrayUtils.arrayToString(array));
        SortsUtils.shake(array);
        System.out.println("Массив после сортировки (шейкер) - " + ArrayUtils.arrayToString(array));
        System.out.println("----------------------------------------------------------------------");

        array = ArrayUtils.arrayFromConsole();
        System.out.println("Массив до сортировки - " + ArrayUtils.arrayToString(array));
        SortsUtils.sort(array);
        System.out.println("Массив после сортировки (пузырьковая) - " + ArrayUtils.arrayToString(array));

        array = ArrayUtils.arrayFromConsole();
        System.out.println("Массив до сортировки - " + ArrayUtils.arrayToString(array));
        SortsUtils.shake(array);
        System.out.println("Массив после сортировки (шейкер) - " + ArrayUtils.arrayToString(array));
    }
}
