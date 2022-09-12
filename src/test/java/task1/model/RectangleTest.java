package task1.model;

import org.junit.Test;
import task1.exceptions.WrongDimensionException;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test(expected = WrongDimensionException.class)
    public void shouldThrowWrongDimensionException() {
        Rectangle r1 = new Rectangle(0, 3);
    }

    @Test(expected = WrongDimensionException.class)
    public void shouldThrowWrongDimensionException2() {
        Rectangle r1 = new Rectangle(3, 0);
    }

}