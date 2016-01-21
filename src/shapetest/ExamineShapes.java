package shapetest;

/**
 * Created by Cardoso on 20-Jan-16.
 */
public class ExamineShapes {
    public Shape[] shapes;{
        Shape rectangle = new Rectangle(5.5,4.2);
        Shape circle = new Circle(2.5);
        Shape triangle = new Triangle(2.3,4.5);
        Shape square = new Square(10.2);
        shapes = new Shape[]{rectangle, circle, triangle,square};
    }

    public void defineShape() {
        for (int i = 0; i < shapes.length; i++) {
            String name = shapes[i].getName();
            double area = shapes[i].getArea();
            double perimeter = shapes[i].getPerimeter();
            //String name = ShapeDetail.shapeName();
            //double area = ShapeDetail.shapeArea();
            //double perimeter = ShapeDetail.shapePerimeter();
            System.out.println("The area of the " + name + " is " + area);
            System.out.println("The perimeter of the " + name + " is " + perimeter);
        }
    }

    public static void main(String[] args) {
        new ExamineShapes().defineShape();
    }
}