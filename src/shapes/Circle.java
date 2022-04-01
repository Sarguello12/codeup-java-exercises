package shapes;

import static java.lang.Math.PI;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return PI * (radius * radius);
    }

    public double getCircumference(){
        return 2 * PI * radius;
    }
}
