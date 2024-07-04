package home_work_2.loops;

import home_work_2.utils.ConsoleUtils;

import java.util.Random;

public class ProbabilityOfEvenNumbers {
    public static void main(String[] args) {
        System.out.print("Сколько случайных чисел хотите проверить на четность: ");
        String row = ConsoleUtils.inputFromConsole();
        String result;

        if (ConsoleUtils.isInt(row) && Integer.parseInt(row) >= 1000) {
            result =  "Процент четных чисел из " + row + " случайно выбранных составляет " + probabilityСalculation(Integer.parseInt(row));
        } else {
            result = "Перезапустите программу и введите целое число большее или равно 1000";
        }

        System.out.println(result);

    }

    public static double probabilityСalculation(int countNumbers) {
        Random rnd = new Random();
        double countEven = 0;

        for (int i = 0; i < countNumbers; i++) {
            if(rnd.nextInt() % 2 == 0) {
                countEven++;
            }
        }

        return countEven / countNumbers * 100;
    }
}
