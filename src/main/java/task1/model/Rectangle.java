package task1.model;

import task1.exceptions.WrongDimensionException;
import task1.service.RectangleService;

import java.util.ArrayList;
import java.util.List;

public class Rectangle extends Shape {

    private int a;
    private int b;
    private static List<Rectangle> extension = new ArrayList<>();

    public Rectangle() {
    }

    public Rectangle(int a, int b) {
        super("rectangle");
        if (a <= 0 || b <= 0) {
            throw new WrongDimensionException();
        }
        this.a = a;
        this.b = b;
        extension.add(this);
        getShapes().add(this);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public static List<Rectangle> getExtension() {
        return extension;
    }

    @Override
    public String toString() {
        return "Rectangle with dimensions " + a + " and " + b;
    }

    @Override
    public double countArea() {
        return new RectangleService().countArea(this);
    }

    @Override
    public double countPerimeter() {
        return new RectangleService().countPerimeter(this);
    }
}
