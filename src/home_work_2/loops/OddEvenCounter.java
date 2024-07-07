package home_work_2.loops;

import home_work_2.utils.ConsoleUtils;

public class OddEvenCounter {
    public static void main(String[] args) {
        String result;

        System.out.print("Введите число: ");
        String row = ConsoleUtils.inputFromConsole();

        if (ConsoleUtils.isInt(row)) {
            int number = Math.abs(Integer.parseInt(row));
            result = "Число " + Integer.parseInt(row) + " содержит " + oddCounter(number) + " нечетных и " + evenCounter(number) + " четных цифр";
        } else {
            result = "Вы ввели не целое число!";
        }

        System.out.println(result);
    }

    // метод для подсчета нечетных цифр
    public static int oddCounter(int number) {
        int oddCount = 0;
        while (number > 0) {
            if(number % 2 == 1) {
                oddCount++;
            }
            number /= 10;
        }
        return oddCount;
    }

    // метод для подсчета четных цифр
    public static int evenCounter(int number) {
        int evenCount = 0;
        while (number > 0) {
            if(number % 2 == 0) {
                evenCount++;
            }
            number /= 10;
        }
        return evenCount;
    }
}
