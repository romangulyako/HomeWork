package home_work_4.comparators;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {
    /**
     * Метод для сравнения двух строк по их длине
     *
     * @param o1 первая строка
     * @param o2 вторая строка
     * @return 0 - если длины строк равны, положительное число - если длина первой строки больше, отрицательное число - если длина второй строки больше
     */
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
