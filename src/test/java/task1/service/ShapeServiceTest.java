package task1.service;

import org.junit.Before;
import org.junit.Test;
import task1.exceptions.*;
import task1.model.*;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ShapeServiceTest {

    private ShapeService shapeService;
    private Square s1;
    private Square s2;
    private Circle c;
    private Rectangle r;
    private Square s3;

    @Before
    public void init() {
        shapeService = new ShapeService();
        Shape.getShapes().clear();
        s1 = new Square(5);
        s2 = new Square(10);
        c = new Circle(5);
        r = new Rectangle(10, 5);
        s3 = new Square(5);
    }

    @Test
    public void shouldReturnS2AsShapeWithBiggestArea() {
        assertEquals(s2, shapeService.findTheShapeWithBiggestArea(Shape.getShapes()));
    }

    @Test
    public void shouldReturnS2AsSquareWithBiggestPerimeter() {
        assertEquals(s2, shapeService.findTheShapeWithBiggestPerimeter(Shape.getShapes(), Shape.class));
    }

    @Test
    public void shouldReturnS2AsSquareWithBiggestPerimeter2() {
        assertEquals(s2, shapeService.findTheShapeWithBiggestPerimeter(Shape.getShapes(), Square.class));
    }

    @Test
    public void shouldReturnCAsCircleWithBiggestPerimeter() {
        assertEquals(c, shapeService.findTheShapeWithBiggestPerimeter(Shape.getShapes(), Circle.class));
    }

    @Test
    public void shouldReturnRAsRectangleWithBiggestPerimeter() {
        assertEquals(r, shapeService.findTheShapeWithBiggestPerimeter(Shape.getShapes(), Rectangle.class));
    }

    @Test(expected = NullListOfFiguresException.class)
    public void shouldTrownNullListOfFiguresException() {
        shapeService.findTheShapeWithBiggestArea(null);
    }

    @Test(expected = NullListOfFiguresException.class)
    public void shouldTrownNullListOfFiguresException2() {
        shapeService.findTheShapeWithBiggestPerimeter(null, Shape.class);
    }

    @Test(expected = NoMaxAreaException.class)
    public void shouldTrownNoMaxAreaException() {
        shapeService.findTheShapeWithBiggestArea(Arrays.asList());
    }

    @Test(expected = NoMaxPerimeterException.class)
    public void shouldTrownNoMaxPerimeterException() {
        shapeService.findTheShapeWithBiggestPerimeter(Arrays.asList(), Shape.class);
    }

    @Test(expected = NoMaxPerimeterException.class)
    public void shouldTrownNoMaxPerimeterException2() {
        shapeService.findTheShapeWithBiggestPerimeter(Arrays.asList(s1, s2, r, s3), Circle.class);
    }

    @Test
    public void shouldReturnThatNumberOfShapesAreEquals() throws IOException {
        shapeService.exportToJson(Shape.getShapes(), "src/main/resources/listoffigures");
        assertEquals(Shape.getShapes().size(), shapeService.importFromJson("src/main/resources/listoffigures").size());
    }

}