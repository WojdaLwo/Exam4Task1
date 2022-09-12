package task1.service;

import org.junit.Before;
import org.junit.Test;
import task1.exceptions.NoShapeExptection;
import task1.model.Square;

import static org.junit.Assert.*;

public class SquareServiceTest {

    private SquareService squareService;
    private Square s1;

    @Before
    public void init() {
        squareService = new SquareService();
        s1 = new Square(7);
    }

    @Test(expected = NoShapeExptection.class)
    public void shouldThrowNoShapeException() {
        squareService.countArea(null);
    }

    @Test(expected = NoShapeExptection.class)
    public void shouldThrowNoShapeException2() {
        squareService.countPerimeter(null);
    }

    @Test
    public void shouldReturnAreaIs12() {
        assertEquals(49, squareService.countArea(s1), 0.01);
    }

    @Test
    public void shouldReturnPerimeterIs14() {
        assertEquals(28, squareService.countPerimeter(s1), 0.01);
    }

}