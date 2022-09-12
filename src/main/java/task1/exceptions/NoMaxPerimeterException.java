package task1.exceptions;

public class NoMaxPerimeterException extends RuntimeException{
    public NoMaxPerimeterException() {
    }

    public NoMaxPerimeterException(String message) {
        super(message);
    }
}
