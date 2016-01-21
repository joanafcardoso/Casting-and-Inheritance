package shapetest;

/**
 * Created by Cardoso on 20-Jan-16.
 */
public class Circle extends Shape{
    private double radius;
    String name;
    double pi = Math.PI;

    public Circle (double radius){
        this.name = "circle";
        this.radius = radius;
    }

    public String getName(){
        return name;
    }

    public double getArea(){
        return pi * Math.pow(radius, 2);
    }

    public double getPerimeter(){
        return 2 * pi * radius;
    }
}
