package task1.model;

import org.junit.Test;
import task1.exceptions.WrongDimensionException;

import static org.junit.Assert.*;

public class SquareTest {

    @Test(expected = WrongDimensionException.class)
    public void shouldThrowWrongDimensionException() {
        Square c1 = new Square(0);
    }

}