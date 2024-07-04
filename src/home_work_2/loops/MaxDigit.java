package home_work_2.loops;

import home_work_2.utils.ConsoleUtils;

public class MaxDigit {
    public static void main(String[] args) {
        String result;

        System.out.print("Введите число: ");
        String row = ConsoleUtils.inputFromConsole();

        if (ConsoleUtils.isInt(row)) {
            int number = Math.abs(Integer.parseInt(row));
            result = "Максимальная цифра числа " + Integer.parseInt(row) + " это " + maxDigit(number);
        } else {
            result = "Вы ввели не целое число!";
        }

        System.out.println(result);
    }

    public static int maxDigit (int number) {
        int max = -1;
        while (number > 0) {
            if (number % 10 > max) {
                max = number % 10;
            }
            number /= 10;
        }
        return max;
    }
}
