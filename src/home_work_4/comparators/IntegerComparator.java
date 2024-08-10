package home_work_4.comparators;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {
    /**
     * Метод для сравнения двух объектов типа Integer
     *
     * @param o1 первое число
     * @param o2 второе число
     * @return 0 - если числа равны, положительное число - если первое число больше, отрицательное число - если второе число больше
     */
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }

}
