package home_work_5.exceptions;

public class NullArgumentException extends NullPointerException {
    public NullArgumentException() {
        super("В параметр передан null!");
    }

    public NullArgumentException(String s) {
        super(s);
    }

    public static void check(Object object) {
        if (object == null) {
            throw new NullArgumentException();
        }
    }
}
