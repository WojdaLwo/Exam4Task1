package task1.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import task1.interfaces.Calculations;

import java.util.ArrayList;
import java.util.List;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Square.class, name = "square"),
        @JsonSubTypes.Type(value = Circle.class, name = "circle"),
        @JsonSubTypes.Type(value = Rectangle.class, name = "rectangle")})

public abstract class Shape implements Calculations {

    private String type;
    private static List<Shape> shapes = new ArrayList<>();

    public Shape() {
    }

    public Shape(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static List<Shape> getShapes() {
        return shapes;
    }


}
