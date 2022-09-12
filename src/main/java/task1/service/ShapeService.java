package task1.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import task1.exceptions.*;
import task1.model.Shape;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class ShapeService {

    public Shape findTheShapeWithBiggestArea(List<Shape> figureList) {
        return Optional.ofNullable(figureList)
                .orElseThrow(NullListOfFiguresException::new)
                .stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparingDouble(Shape::countArea))
                .orElseThrow(NoMaxAreaException::new);
    }

    public Shape findTheShapeWithBiggestPerimeter(List<Shape> figureList, Class c) {
        return Optional.ofNullable(figureList)
                .orElseThrow(NullListOfFiguresException::new)
                .stream()
                .filter(Objects::nonNull)
                .filter(c::isInstance)
                .max(Comparator.comparingDouble(Shape::countPerimeter))
                .orElseThrow(NoMaxPerimeterException::new);
    }

    public void exportToJson(List<Shape> figureList, String path) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(path), figureList);

    }

    public List<Shape> importFromJson(String path) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper.readValue(new File(path), objectMapper.getTypeFactory().constructCollectionType(
                List.class, Shape.class));
    }


}
