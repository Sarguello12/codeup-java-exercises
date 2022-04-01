package shapes;

import static java.lang.Math.PI;

public class Circle {
    private double radius;
    static int totalCircles = 0;


    public Circle(double radius){
        this.radius = radius;
        totalCircles++;
    }

    public double getArea(){
        return PI * (radius * radius);
    }

    public double getCircumference(){
        return 2 * PI * radius;
    }
}
