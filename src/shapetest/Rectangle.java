package shapetest;

/**
 * Created by Cardoso on 20-Jan-16.
 */
public class Rectangle extends Shape{
    public double width,height;
    String name;

    public Rectangle(double width, double height){
        this.name = "rectangle";
        this.width = width;
        this.height = height;
    }

    public String getName(){
        return name;
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return (width+height)*2;
    }
}
