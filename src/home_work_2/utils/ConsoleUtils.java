package home_work_2.utils;

import java.util.Scanner;

public class ConsoleUtils {
    // метод проверяет, корректно ли в строку записано число типа int
    public static boolean isInt(String row) throws NumberFormatException {
        try {
            Integer.parseInt(row);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // метод проверяет, корректно ли в строку записано число типа double
    public static boolean isDouble(String row) throws NumberFormatException {
        try {
            Double.parseDouble(row);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Метод для ввода с консоли строки
    public static String inputFromConsole() {
        Scanner console = new Scanner(System.in);

        return console.nextLine();
    }
}
