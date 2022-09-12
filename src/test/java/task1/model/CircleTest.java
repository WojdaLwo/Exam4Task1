package task1.model;

import org.junit.Before;
import org.junit.Test;
import task1.exceptions.WrongDimensionException;

import static org.junit.Assert.*;

public class CircleTest {

    @Test(expected = WrongDimensionException.class)
    public void shouldThrowWrongDimensionException() {
        Circle c1 = new Circle(0);
    }

}