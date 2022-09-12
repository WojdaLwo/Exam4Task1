package task1.service;

import org.junit.Before;
import org.junit.Test;
import task1.exceptions.NoShapeExptection;
import task1.model.Rectangle;

import static org.junit.Assert.*;

public class RectangleServiceTest {

    private RectangleService rectangleService;
    private Rectangle r1;

    @Before
    public void init() {
        rectangleService = new RectangleService();
        r1 = new Rectangle(3, 4);
    }

    @Test(expected = NoShapeExptection.class)
    public void shouldThrowNoShapeException() {
        rectangleService.countArea(null);
    }

    @Test(expected = NoShapeExptection.class)
    public void shouldThrowNoShapeException2() {
        rectangleService.countPerimeter(null);
    }

    @Test
    public void shouldReturnAreaIs12() {
        assertEquals(12, rectangleService.countArea(r1), 0.01);
    }

    @Test
    public void shouldReturnPerimeterIs14() {
        assertEquals(14, rectangleService.countPerimeter(r1), 0.01);
    }

}