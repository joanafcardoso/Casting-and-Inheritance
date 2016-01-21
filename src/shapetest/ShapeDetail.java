package shapetest;

/**
 * Created by Cardoso on 20-Jan-16.
 */
public class ShapeDetail {
    public static double shapeArea(Shape shape) {
        return shape.getArea();
    }

    public static double shapePerimeter(Shape shape) {
        return shape.getPerimeter();
    }

    public static String shapeName(Shape shape) {
        return shape.getName();
    }
}