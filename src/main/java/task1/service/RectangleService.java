package task1.service;

import task1.exceptions.NoShapeExptection;
import task1.model.Rectangle;

public class RectangleService {

    public double countArea(Rectangle r) {
        if (r == null) {
            throw new NoShapeExptection();
        }
        return r.getA() * r.getB();
    }

    public double countPerimeter(Rectangle r) {
        if (r == null) {
            throw new NoShapeExptection();
        }
        return (r.getA() + r.getB()) * 2;
    }

}
