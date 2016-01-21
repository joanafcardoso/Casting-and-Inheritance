package shapetest;

/**
 * Created by Cardoso on 20-Jan-16.
 */
public class Triangle extends Shape {
    private double lengtha,lengthb;
    double hypotenuse;
    String name;

    public Triangle(double lengtha,double lengthb){
        hypotenuse = Math.sqrt(lengtha*lengtha + lengthb*lengthb);
        this.name = "triangle";
        this.lengtha = lengtha;
        this.lengthb = lengthb;
    }

    public String getName(){
        return name;
    }

    public double getArea(){
        // Heron's formula:
        // A = SquareRoot(p * (p - a) * (p - b) * (p - c))
        // where p = (a + b + c) / 2, or 1/2 of the perimeter of the triangle
        double p = (lengtha + lengthb + hypotenuse) / 2;
        return Math.sqrt(p * (p - lengtha) * (p - lengthb) * (p - hypotenuse));
    }

    public double getPerimeter(){
        return lengtha+lengthb+hypotenuse;
    }
}
