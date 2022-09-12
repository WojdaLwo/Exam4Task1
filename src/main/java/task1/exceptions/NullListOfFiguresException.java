package task1.exceptions;

public class NullListOfFiguresException extends RuntimeException{

    public NullListOfFiguresException() {
    }

    public NullListOfFiguresException(String message) {
        super(message);
    }
}
