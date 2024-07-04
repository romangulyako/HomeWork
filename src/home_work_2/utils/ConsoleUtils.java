package home_work_2.utils;

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
}
