public class InvalidationException extends RuntimeException {

    public InvalidationException() {
    }

    public InvalidationException(String message) {
        super(message);
    }

    public InvalidationException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidationException(Throwable cause) {
        super(cause);
    }

    public InvalidationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
//1
