package home_work_2.utils;

public class ConsoleUtils {
    // метод проверяет, корректно ли в строку записано целое число
    public static boolean isInt(String row) throws NumberFormatException {
        try {
            Integer.parseInt(row);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
