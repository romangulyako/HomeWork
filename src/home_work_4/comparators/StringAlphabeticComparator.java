package home_work_4.comparators;

import java.util.Comparator;

public class StringAlphabeticComparator implements Comparator<String> {
    /**
     * Метод для сравнения двух строк по алфавиту
     *
     * @param o1 первая строка
     * @param o2 вторая строка
     * @return 0 - если строки равны, положительное число - если первая строка по алфавиту стоит выше, отрицательное число - если вторая строка по алфавиту стоит выше
     */
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
