package home_work_5.exceptions;

public class FileHandlingException extends RuntimeException {
    public FileHandlingException() {
        super("Ошибка работы с файлом");
    }

    public FileHandlingException(String message) {
        super(message);
    }

    public FileHandlingException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileHandlingException(Throwable cause) {
        super(cause);
    }
}
