public class StudentExeption extends Exception {
    public StudentExeption() {
    }

    public StudentExeption(String message) {
        super(message);
    }

    public StudentExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentExeption(Throwable cause) {
        super(cause);
    }

    public StudentExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
