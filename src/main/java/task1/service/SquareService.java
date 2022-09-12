package task1.service;

import task1.exceptions.NoShapeExptection;
import task1.model.Square;

public class SquareService {

    public double countArea(Square s) {
        if (s == null) {
            throw new NoShapeExptection();
        }
        return s.getSide() * s.getSide();
    }

    public double countPerimeter(Square s) {
        if (s == null) {
            throw new NoShapeExptection();
        }
        return s.getSide() * 4;
    }
}
