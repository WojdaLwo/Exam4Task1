package task1.exceptions;

public class WrongDimensionException extends RuntimeException{

    public WrongDimensionException() {
    }

    public WrongDimensionException(String message) {
        super(message);
    }
}
