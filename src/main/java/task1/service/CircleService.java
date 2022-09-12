package task1.service;

import task1.exceptions.NoShapeExptection;
import task1.model.Circle;

public class CircleService {

    public double countArea(Circle c) {
        if (c == null) {
            throw new NoShapeExptection();
        }
        return Math.PI * c.getRadius() * c.getRadius();
    }

    public double countPerimeter(Circle c) {
        if (c == null) {
            throw new NoShapeExptection();
        }
        return Math.PI * c.getRadius() * 2;
    }
}
