package home_work_2.loops;

import home_work_2.utils.ConsoleUtils;

public class Exponentiation {
    public static void main(String[] args) {
        boolean isCorrectInput = false;                                                                             // Флаг для определения корректности ввода
        double number = 0.0;
        int degree = 0;

        while (!isCorrectInput) {                                                                                   // Ввод с консоли возводимого числа
            System.out.print("Введите возводимое число: ");
            String row = ConsoleUtils.inputFromConsole();
            if(ConsoleUtils.isDouble(row)) {
                number = Double.parseDouble(row);
                isCorrectInput = true;
            } else {
                System.out.println("Вы должны ввести дробное число, повторите ввод!");
            }
        }

        isCorrectInput = false;
        while (!isCorrectInput) {                                                                                   // Ввод с консоли степени возведения
            System.out.print("Введите степень возведения: ");
            String row = ConsoleUtils.inputFromConsole();
            if(isValidDegree(row)) {
                degree = Integer.parseInt(row);
                isCorrectInput = true;
            } else {
                System.out.println("Степень возведения должна быть целым положительным числом, повторите ввод!");
            }
        }

        System.out.println(number + " ^ " + degree + " = " + exponentiation(number,degree));

    }

    public static boolean isValidDegree(String degree) {
        return ConsoleUtils.isInt(degree) && Integer.parseInt(degree) >= 0;
    }

    public static double exponentiation(double number, int degree) {     // Метод для возведения в степень
        if (number == 0) {
            return 0;
        }

        if (number == 1 || degree == 0) {
            return 1;
        }

        if (degree > 0) {
            double result = 1.0;

            for (int i = 0; i < degree; i++) {
                result *= number;
            }

            return result;
        }

        return -1;
    }
}
