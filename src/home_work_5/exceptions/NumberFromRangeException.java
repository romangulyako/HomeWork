package home_work_5.exceptions;

public class NumberFromRangeException extends IllegalArgumentException {
    public NumberFromRangeException() {
        super("Неверно переданы параметры!");
    }

    public NumberFromRangeException(String s) {
        super(s);
    }

    public NumberFromRangeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NumberFromRangeException(Throwable cause) {
        super(cause);
    }

    public static void checkCompareMinAndMax(int minimalNumber, int maximumNumber) {
        if (minimalNumber > maximumNumber) {
            throw new NumberFromRangeException("Минимальное число не может быть больше максимального");
        }
    }

    public static void checkPositiveMin(int minimalNumber) {
        if (minimalNumber <= 0) {
            throw new NumberFromRangeException("Минимальное число должно быть больше 0");
        }
    }
}
