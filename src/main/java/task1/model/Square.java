package task1.model;

import task1.exceptions.WrongDimensionException;
import task1.service.SquareService;

import java.util.ArrayList;
import java.util.List;

public class Square extends Shape {

    private int side;
    private static List<Square> extension = new ArrayList<>();

    public Square() {
    }

    public Square(int side) {
        super("square");
        if (side <= 0) {
            throw new WrongDimensionException();
        }
        this.side = side;
        extension.add(this);
        getShapes().add(this);
    }

    public int getSide() {
        return side;
    }

    public static List<Square> getExtension() {
        return extension;
    }

    @Override
    public String toString() {
        return "Square with side=" + side;
    }

    @Override
    public double countArea() {
        return new SquareService().countArea(this);
    }

    @Override
    public double countPerimeter() {
        return new SquareService().countPerimeter(this);
    }


}
