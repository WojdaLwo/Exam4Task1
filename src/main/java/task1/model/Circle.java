package task1.model;

import task1.exceptions.WrongDimensionException;
import task1.service.CircleService;

import java.util.ArrayList;
import java.util.List;

public class Circle extends Shape {

    private int radius;
    private static List<Circle> extension = new ArrayList<>();

    public Circle() {
    }

    public Circle(int radius) {
        super("circle");
        if (radius <= 0) {
            throw new WrongDimensionException();
        }
        this.radius = radius;
        extension.add(this);
        getShapes().add(this);
    }

    public int getRadius() {
        return radius;
    }

    public static List<Circle> getExtension() {
        return extension;
    }

    @Override
    public String toString() {
        return "Circle with radius=" + radius;
    }

    @Override
    public double countArea() {
        return new CircleService().countArea(this);
    }

    @Override
    public double countPerimeter() {
        return new CircleService().countPerimeter(this);
    }
}
